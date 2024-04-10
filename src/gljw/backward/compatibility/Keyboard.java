package gljw.backward.compatibility;


import static gljw.glfw.GLFW.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Keyboard {

	private static LinkedList<KeyEvent> 	keyEvents; 	
	private static LinkedList<CharEvent> 	charEvents; 
	private static LinkedList<Event> 		events;		
	private static Map<Integer, Character>	pressedKeysChars;	 
	private static int 		eventKey;
	private static char 	eventChar;
	private static boolean 	eventState;
	private static boolean 	isCreated;
	
	private static class Event {
		
		final int 	key;
		final char 	_char;
		final boolean eventState;
		
		Event(int key, char _char, boolean eventState) {
			this.key = key;
			this._char = _char;
			this.eventState = eventState;
		}
		
		void apply() {
			Keyboard.eventKey 	= key;
			Keyboard.eventChar 	= _char;
			Keyboard.eventState = eventState;
		}
	}
	
	private static class KeyEvent {
		
		final int 		key;
		final boolean 	printable;
		final boolean 	eventState;
		
		KeyEvent(int key, boolean printable, boolean eventState) {
			this.key = key;
			this.printable = printable;
			this.eventState = eventState;
		}
	}
	
	private static class CharEvent{
		final char __char;
		CharEvent(char _char) {
			__char = _char;
		}
	}
	
	public static boolean areRepeatEventsEnabled() {
		return true;
	}
	
	public static void enableRepeatEvents(boolean enable) {
		
	}
	
	static void update() {
		while (true) {
			if (keyEvents.size() == 0) break;
			KeyEvent key = keyEvents.getFirst();
			if (key.printable) {
				if (key.eventState) {
					if (charEvents.size() == 0) break;
					keyEvents.removeFirst();
					CharEvent _char = charEvents.removeFirst();
					events.add(new Event(key.key, _char.__char, key.eventState));
					pressedKeysChars.put(key.key, _char.__char);
				}else {
					keyEvents.removeFirst();
					events.add(new Event(key.key, pressedKeysChars.remove(key.key), key.eventState));	
				}
			}else {
				keyEvents.removeFirst();
				events.add(new Event(key.key, (char)0, key.eventState));
			}
		}
	}
	
	public static boolean next() {
		if (events.size() == 0) return false;
		events.removeFirst().apply();
		return true;
	}
	
	public static int getEventKey() {
		return eventKey;
	}
	
	public static char getEventCharacter() {
		return eventChar;
	}
	
	public static boolean getEventState() {
		return eventState;
	}
	
	static void addKeyEvent(int key, boolean eventState) {
		keyEvents.add(new KeyEvent(key, isPrintableKey(key), eventState));
	}
	
	static void addCharEvent(char _char) {
		charEvents.add(new CharEvent(_char));	
	}
	
	public static void create() {
		keyEvents 	= new LinkedList<>();
		charEvents 	= new LinkedList<>();
		events 		= new LinkedList<>();
		pressedKeysChars = new HashMap<>();
		isCreated 	= true;
	}
	
	public static void destoy() {
		keyEvents 	= null;
		charEvents 	= null;
		pressedKeysChars = null;
		events 		= null;
		isCreated 	= false;
	}
	
	public static boolean isCreated() {
		return isCreated;
	}
	
	public static boolean isPrintableKey(int key) {
		return key >= GLFW_KEY_SPACE && key <= GLFW_KEY_GRAVE_ACCENT;
	}
	
	public static boolean isKeyDown(int key) {
		if (!isCreated()) throw new RuntimeException("Keyboard is not created!");
		if (!Display.isCreated()) throw new RuntimeException("Display is not created!");
		return glfwGetKey(Display.getWindowHandle(), key) == GLFW_PRESS;
	}
}
