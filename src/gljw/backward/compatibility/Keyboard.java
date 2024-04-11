/*
 * Copyright (c) 2024, Miracle-Masterpiсe <mrmiraclemasterpiece@gmail.com or https://t.me/MiracleMasterpiece>. All rights reserved.
 * Use is subject to license terms.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
package gljw.backward.compatibility;


import static gljw.glfw.GLFW.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Keyboard {

	/* Printable keys */
	public static final byte KEY_SPACE = GLFW_KEY_SPACE;
	public static final byte KEY_APOSTROPHE = GLFW_KEY_APOSTROPHE;/* ' */
	public static final byte KEY_COMMA = GLFW_KEY_COMMA;/* , */
	public static final byte KEY_MINUS = GLFW_KEY_MINUS;/* - */
	public static final byte KEY_PERIOD = GLFW_KEY_PERIOD;/* . */
	public static final byte KEY_SLASH = GLFW_KEY_SLASH;/* / */
	public static final byte KEY_0 = GLFW_KEY_0;
	public static final byte KEY_1 = GLFW_KEY_1;
	public static final byte KEY_2 = GLFW_KEY_2;
	public static final byte KEY_3 = GLFW_KEY_3;
	public static final byte KEY_4 = GLFW_KEY_4;
	public static final byte KEY_5 = GLFW_KEY_5;
	public static final byte KEY_6 = GLFW_KEY_6;
	public static final byte KEY_7 = GLFW_KEY_7;
	public static final byte KEY_8 = GLFW_KEY_8;
	public static final byte KEY_9 = GLFW_KEY_9;
	public static final byte KEY_SEMICOLON = GLFW_KEY_SEMICOLON;/* ; */
	public static final byte KEY_EQUAL = GLFW_KEY_EQUAL;/* = */
	public static final byte KEY_A = GLFW_KEY_A;
	public static final byte KEY_B = GLFW_KEY_B;
	public static final byte KEY_C = GLFW_KEY_C;
	public static final byte KEY_D = GLFW_KEY_D;
	public static final byte KEY_E = GLFW_KEY_E;
	public static final byte KEY_F = GLFW_KEY_F;
	public static final byte KEY_G = GLFW_KEY_G;
	public static final byte KEY_H = GLFW_KEY_H;
	public static final byte KEY_I = GLFW_KEY_I;
	public static final byte KEY_J = GLFW_KEY_J;
	public static final byte KEY_K = GLFW_KEY_K;
	public static final byte KEY_L = GLFW_KEY_L;
	public static final byte KEY_M = GLFW_KEY_M;
	public static final byte KEY_N = GLFW_KEY_N;
	public static final byte KEY_O = GLFW_KEY_O;
	public static final byte KEY_P = GLFW_KEY_P;
	public static final byte KEY_Q = GLFW_KEY_Q;
	public static final byte KEY_R = GLFW_KEY_R;
	public static final byte KEY_S = GLFW_KEY_S;
	public static final byte KEY_T = GLFW_KEY_T;
	public static final byte KEY_U = GLFW_KEY_U;
	public static final byte KEY_V = GLFW_KEY_V;
	public static final byte KEY_W = GLFW_KEY_W;
	public static final byte KEY_X = GLFW_KEY_X;
	public static final byte KEY_Y = GLFW_KEY_Y;
	public static final byte KEY_Z = GLFW_KEY_Z;
	public static final byte KEY_LEFT_BRACKET = GLFW_KEY_LEFT_BRACKET;/* [ */
	public static final byte KEY_BACKSLASH = GLFW_KEY_BACKSLASH;/* \ */
	public static final byte KEY_RIGHT_BRACKET = GLFW_KEY_RIGHT_BRACKET;/* ] */
	public static final byte KEY_GRAVE_ACCENT = GLFW_KEY_GRAVE_ACCENT;/* ` */
	public static final char KEY_WORLD_1 = GLFW_KEY_WORLD_1;/* non-US #1 */
	public static final char KEY_WORLD_2 = GLFW_KEY_WORLD_2;/* non-US #2 */

	/* Function keys */
	public static final char KEY_ESCAPE = GLFW_KEY_ESCAPE;
	public static final char KEY_ENTER = GLFW_KEY_ENTER;
	public static final char KEY_TAB = GLFW_KEY_TAB;
	public static final char KEY_BACKSPACE = GLFW_KEY_BACKSPACE;
	public static final char KEY_INSERT = GLFW_KEY_INSERT;
	public static final char KEY_DELETE = GLFW_KEY_DELETE;
	public static final char KEY_RIGHT = GLFW_KEY_RIGHT;
	public static final char KEY_LEFT = GLFW_KEY_LEFT;
	public static final char KEY_DOWN = GLFW_KEY_DOWN;
	public static final char KEY_UP = GLFW_KEY_UP;
	public static final char KEY_PAGE_UP = GLFW_KEY_PAGE_UP;
	public static final char KEY_PAGE_DOWN = GLFW_KEY_PAGE_DOWN;
	public static final char KEY_HOME = GLFW_KEY_HOME;
	public static final char KEY_END = GLFW_KEY_END;
	public static final char KEY_CAPS_LOCK = GLFW_KEY_CAPS_LOCK;
	public static final char KEY_SCROLL_LOCK = GLFW_KEY_SCROLL_LOCK;
	public static final char KEY_NUM_LOCK = GLFW_KEY_NUM_LOCK;
	public static final char KEY_PRINT_SCREEN = GLFW_KEY_PRINT_SCREEN;
	public static final char KEY_PAUSE = GLFW_KEY_PAUSE;
	public static final char KEY_F1 = GLFW_KEY_F1;
	public static final char KEY_F2 = GLFW_KEY_F2;
	public static final char KEY_F3 = GLFW_KEY_F3;
	public static final char KEY_F4 = GLFW_KEY_F4;
	public static final char KEY_F5 = GLFW_KEY_F5;
	public static final char KEY_F6 = GLFW_KEY_F6;
	public static final char KEY_F7 = GLFW_KEY_F7;
	public static final char KEY_F8 = GLFW_KEY_F8;
	public static final char KEY_F9 = GLFW_KEY_F9;
	public static final char KEY_F10 = GLFW_KEY_F10;
	public static final char KEY_F11 = GLFW_KEY_F11;
	public static final char KEY_F12 = GLFW_KEY_F12;
	public static final char KEY_F13 = GLFW_KEY_F13;
	public static final char KEY_F14 = GLFW_KEY_F14;
	public static final char KEY_F15 = GLFW_KEY_F15;
	public static final char KEY_F16 = GLFW_KEY_F16;
	public static final char KEY_F17 = GLFW_KEY_F17;
	public static final char KEY_F18 = GLFW_KEY_F18;
	public static final char KEY_F19 = GLFW_KEY_F19;
	public static final char KEY_F20 = GLFW_KEY_F20;
	public static final char KEY_F21 = GLFW_KEY_F21;
	public static final char KEY_F22 = GLFW_KEY_F22;
	public static final char KEY_F23 = GLFW_KEY_F23;
	public static final char KEY_F24 = GLFW_KEY_F24;
	public static final char KEY_F25 = GLFW_KEY_F25;
	public static final char KEY_KP_0 = GLFW_KEY_KP_0;
	public static final char KEY_KP_1 = GLFW_KEY_KP_1;
	public static final char KEY_KP_2 = GLFW_KEY_KP_2;
	public static final char KEY_KP_3 = GLFW_KEY_KP_3;
	public static final char KEY_KP_4 = GLFW_KEY_KP_4;
	public static final char KEY_KP_5 = GLFW_KEY_KP_5;
	public static final char KEY_KP_6 = GLFW_KEY_KP_6;
	public static final char KEY_KP_7 = GLFW_KEY_KP_7;
	public static final char KEY_KP_8 = GLFW_KEY_KP_8;
	public static final char KEY_KP_9 = GLFW_KEY_KP_9;
	public static final char KEY_KP_DECIMAL = GLFW_KEY_KP_DECIMAL;
	public static final char KEY_KP_DIVIDE = GLFW_KEY_KP_DIVIDE;
	public static final char KEY_KP_MULTIPLY = GLFW_KEY_KP_MULTIPLY;
	public static final char KEY_KP_SUBTRACT = GLFW_KEY_KP_SUBTRACT;
	public static final char KEY_KP_ADD = GLFW_KEY_KP_ADD;
	public static final char KEY_KP_ENTER = GLFW_KEY_KP_ENTER;
	public static final char KEY_KP_EQUAL = GLFW_KEY_KP_EQUAL;
	public static final char KEY_LEFT_SHIFT = GLFW_KEY_LEFT_SHIFT;
	public static final char KEY_LEFT_CONTROL = GLFW_KEY_LEFT_CONTROL;
	public static final char KEY_LEFT_ALT = GLFW_KEY_LEFT_ALT;
	public static final char KEY_LEFT_SUPER = GLFW_KEY_LEFT_SUPER;
	public static final char KEY_RIGHT_SHIFT = GLFW_KEY_RIGHT_SHIFT;
	public static final char KEY_RIGHT_CONTROL = GLFW_KEY_RIGHT_CONTROL;
	public static final char KEY_RIGHT_ALT = GLFW_KEY_RIGHT_ALT;
	public static final char KEY_RIGHT_SUPER = GLFW_KEY_RIGHT_SUPER;
	public static final char KEY_MENU = GLFW_KEY_MENU;
	public static final int KEY_LAST = GLFW_KEY_LAST;
	
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
	
	public static boolean getEventKeyState() {
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
	
	public static void destroy() {
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
