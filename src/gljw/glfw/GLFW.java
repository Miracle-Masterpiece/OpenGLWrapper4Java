/*=========================== LICENCE GLFW ===========================
 * 
 * Copyright © 2002-2006 Marcus Geelnard
 * 
 * Copyright © 2006-2019 Camilla Löwy
 * 
 * This software is provided ‘as-is’, without any express or implied warranty. In no event will the authors be held liable for any damages arising from the use of this software.
 * 
 * Permission is granted to anyone to use this software for any purpose, including commercial applications, and to alter it and redistribute it freely, subject to the following restrictions:
 * 
 * The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment in the product documentation would be appreciated but is not required.
 * 
 * Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
 * 
 * This notice may not be removed or altered from any source distribution.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

/*
 * Copyright (c) 2024 Miracle-Masterpiсe <mrmiraclemasterpiece@gmail.com or https://t.me/MiracleMasterpiece>. All rights reserved.
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
package gljw.glfw;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
import java.util.Iterator;
import nw4j.wrapper.c.pointers.BytePointer;
import nw4j.wrapper.c.pointers.DoublePointer;
import nw4j.wrapper.c.pointers.FloatPointer;
import nw4j.wrapper.c.pointers.IntPointer;
import nw4j.wrapper.c.pointers.VoidPointer;
import gljw.annotations.Ctype;
import gljw.annotations.Nullable;
import gljw.glfw.callbacks.ICharCallback;
import gljw.glfw.callbacks.ICharModsCallback;
import gljw.glfw.callbacks.ICursorEnterCallback;
import gljw.glfw.callbacks.ICursorPosCallback;
import gljw.glfw.callbacks.IDropCallback;
import gljw.glfw.callbacks.IErrorCallback;
import gljw.glfw.callbacks.IFramebufferSizeCallback;
import gljw.glfw.callbacks.IJoystickCallback;
import gljw.glfw.callbacks.IKeyCallback;
import gljw.glfw.callbacks.IMonitorCallback;
import gljw.glfw.callbacks.IMouseButtonCallback;
import gljw.glfw.callbacks.IScrollCallback;
import gljw.glfw.callbacks.IWindowCloseCallback;
import gljw.glfw.callbacks.IWindowContentScaleCallback;
import gljw.glfw.callbacks.IWindowFocusCallback;
import gljw.glfw.callbacks.IWindowIconifyCallback;
import gljw.glfw.callbacks.IWindowMaximizeCallback;
import gljw.glfw.callbacks.IWindowPosCallback;
import gljw.glfw.callbacks.IWindowRefreshCallback;
import gljw.glfw.callbacks.IWindowSizeCallback;
import gljw.helpers.GLJWLinkedList;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;

import static gljw.helpers.Helpers.createCriticalMethodHandle;
import static gljw.helpers.Helpers.createNoCriticalMethodHandle;;
public final class GLFW {

	private GLFW() {}

	/*************************************************************************
	 * GLFW API tokens
	 *************************************************************************/

	/*! @name GLFW version macros
	 *  @{ */
	/*! @brief The major version number of the GLFW header.
	 *
	 *  The major version number of the GLFW header.  This is incremented when the
	 *  API is changed in non-compatible ways.
	 *  @ingroup init
	 */
	public static final byte GLFW_VERSION_MAJOR = 3;
	/*! @brief The minor version number of the GLFW header.
	 *
	 *  The minor version number of the GLFW header.  This is incremented when
	 *  features are added to the API but it remains backward-compatible.
	 *  @ingroup init
	 */
	public static final byte GLFW_VERSION_MINOR = 4;
	/*! @brief The revision number of the GLFW header.
	 *
	 *  The revision number of the GLFW header.  This is incremented when a bug fix
	 *  release is made that does not contain any API changes.
	 *  @ingroup init
	 */
	public static final byte GLFW_VERSION_REVISION = 0;
	/*! @} */

	/*! @brief One.
	 *
	 *  This is only semantic sugar for the number 1.  You can instead use `1` or
	 *  `true` or `_True` or `GL_TRUE` or `VK_TRUE` or anything else that is equal
	 *  to one.
	 *
	 *  @ingroup init
	 */
	public static final byte GLFW_TRUE = 1;
	/*! @brief Zero.
	 *
	 *  This is only semantic sugar for the number 0.  You can instead use `0` or
	 *  `false` or `_False` or `GL_FALSE` or `VK_FALSE` or anything else that is
	 *  equal to zero.
	 *
	 *  @ingroup init
	 */
	public static final byte GLFW_FALSE = 0;

	/*! @name Key and button actions
	 *  @{ */
	/*! @brief The key or mouse button was released.
	 *
	 *  The key or mouse button was released.
	 *
	 *  @ingroup input
	 */
	public static final byte GLFW_RELEASE = 0;
	/*! @brief The key or mouse button was pressed.
	 *
	 *  The key or mouse button was pressed.
	 *
	 *  @ingroup input
	 */
	public static final byte GLFW_PRESS = 1;
	/*! @brief The key was held down until it repeated.
	 *
	 *  The key was held down until it repeated.
	 *
	 *  @ingroup input
	 */
	public static final byte GLFW_REPEAT = 2;
	/*! @} */

	/*! @defgroup hat_state Joystick hat states
	 *  @brief Joystick hat states.
	 *
	 *  See [joystick hat input](@ref joystick_hat) for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */
	public static final byte GLFW_HAT_CENTERED = 0;
	public static final byte GLFW_HAT_UP = 1;
	public static final byte GLFW_HAT_RIGHT = 2;
	public static final byte GLFW_HAT_DOWN = 4;
	public static final byte GLFW_HAT_LEFT = 8;
	public static final int GLFW_HAT_RIGHT_UP = (GLFW_HAT_RIGHT|GLFW_HAT_UP);
	public static final int GLFW_HAT_RIGHT_DOWN = (GLFW_HAT_RIGHT|GLFW_HAT_DOWN);
	public static final int GLFW_HAT_LEFT_UP = (GLFW_HAT_LEFT|GLFW_HAT_UP);
	public static final int GLFW_HAT_LEFT_DOWN = (GLFW_HAT_LEFT|GLFW_HAT_DOWN);

	/*! @ingroup input
	 */
	public static final int GLFW_KEY_UNKNOWN = -1;

	/*! @} */

	/*! @defgroup keys Keyboard key tokens
	 *  @brief Keyboard key tokens.
	 *
	 *  See [key input](@ref input_key) for how these are used.
	 *
	 *  These key codes are inspired by the _USB HID Usage Tables v1.12_ (p. 53-60),
	 *  but re-arranged to map to 7-bit ASCII for printable keys (function keys are
	 *  put in the 256+ range).
	 *
	 *  The naming of the key codes follow these rules:
	 *   - The US keyboard layout is used
	 *   - Names of printable alphanumeric characters are used (e.g. "A", "R",
	 *     "3", etc.)
	 *   - For non-alphanumeric characters, Unicode:ish names are used (e.g.
	 *     "COMMA", "LEFT_SQUARE_BRACKET", etc.). Note that some names do not
	 *     correspond to the Unicode standard (usually for brevity)
	 *   - Keys that lack a clear US mapping are named "WORLD_x"
	 *   - For non-printable keys, custom names are used (e.g. "F4",
	 *     "BACKSPACE", etc.)
	 *
	 *  @ingroup input
	 *  @{
	 */

	/* Printable keys */
	public static final byte GLFW_KEY_SPACE = 32;
	public static final byte GLFW_KEY_APOSTROPHE = 39;/* ' */
	public static final byte GLFW_KEY_COMMA = 44;/* , */
	public static final byte GLFW_KEY_MINUS = 45;/* - */
	public static final byte GLFW_KEY_PERIOD = 46;/* . */
	public static final byte GLFW_KEY_SLASH = 47;/* / */
	public static final byte GLFW_KEY_0 = 48;
	public static final byte GLFW_KEY_1 = 49;
	public static final byte GLFW_KEY_2 = 50;
	public static final byte GLFW_KEY_3 = 51;
	public static final byte GLFW_KEY_4 = 52;
	public static final byte GLFW_KEY_5 = 53;
	public static final byte GLFW_KEY_6 = 54;
	public static final byte GLFW_KEY_7 = 55;
	public static final byte GLFW_KEY_8 = 56;
	public static final byte GLFW_KEY_9 = 57;
	public static final byte GLFW_KEY_SEMICOLON = 59;/* ; */
	public static final byte GLFW_KEY_EQUAL = 61;/* = */
	public static final byte GLFW_KEY_A = 65;
	public static final byte GLFW_KEY_B = 66;
	public static final byte GLFW_KEY_C = 67;
	public static final byte GLFW_KEY_D = 68;
	public static final byte GLFW_KEY_E = 69;
	public static final byte GLFW_KEY_F = 70;
	public static final byte GLFW_KEY_G = 71;
	public static final byte GLFW_KEY_H = 72;
	public static final byte GLFW_KEY_I = 73;
	public static final byte GLFW_KEY_J = 74;
	public static final byte GLFW_KEY_K = 75;
	public static final byte GLFW_KEY_L = 76;
	public static final byte GLFW_KEY_M = 77;
	public static final byte GLFW_KEY_N = 78;
	public static final byte GLFW_KEY_O = 79;
	public static final byte GLFW_KEY_P = 80;
	public static final byte GLFW_KEY_Q = 81;
	public static final byte GLFW_KEY_R = 82;
	public static final byte GLFW_KEY_S = 83;
	public static final byte GLFW_KEY_T = 84;
	public static final byte GLFW_KEY_U = 85;
	public static final byte GLFW_KEY_V = 86;
	public static final byte GLFW_KEY_W = 87;
	public static final byte GLFW_KEY_X = 88;
	public static final byte GLFW_KEY_Y = 89;
	public static final byte GLFW_KEY_Z = 90;
	public static final byte GLFW_KEY_LEFT_BRACKET = 91;/* [ */
	public static final byte GLFW_KEY_BACKSLASH = 92;/* \ */
	public static final byte GLFW_KEY_RIGHT_BRACKET = 93;/* ] */
	public static final byte GLFW_KEY_GRAVE_ACCENT = 96;/* ` */
	public static final char GLFW_KEY_WORLD_1 = 161;/* non-US #1 */
	public static final char GLFW_KEY_WORLD_2 = 162;/* non-US #2 */

	/* Function keys */
	public static final char GLFW_KEY_ESCAPE = 256;
	public static final char GLFW_KEY_ENTER = 257;
	public static final char GLFW_KEY_TAB = 258;
	public static final char GLFW_KEY_BACKSPACE = 259;
	public static final char GLFW_KEY_INSERT = 260;
	public static final char GLFW_KEY_DELETE = 261;
	public static final char GLFW_KEY_RIGHT = 262;
	public static final char GLFW_KEY_LEFT = 263;
	public static final char GLFW_KEY_DOWN = 264;
	public static final char GLFW_KEY_UP = 265;
	public static final char GLFW_KEY_PAGE_UP = 266;
	public static final char GLFW_KEY_PAGE_DOWN = 267;
	public static final char GLFW_KEY_HOME = 268;
	public static final char GLFW_KEY_END = 269;
	public static final char GLFW_KEY_CAPS_LOCK = 280;
	public static final char GLFW_KEY_SCROLL_LOCK = 281;
	public static final char GLFW_KEY_NUM_LOCK = 282;
	public static final char GLFW_KEY_PRINT_SCREEN = 283;
	public static final char GLFW_KEY_PAUSE = 284;
	public static final char GLFW_KEY_F1 = 290;
	public static final char GLFW_KEY_F2 = 291;
	public static final char GLFW_KEY_F3 = 292;
	public static final char GLFW_KEY_F4 = 293;
	public static final char GLFW_KEY_F5 = 294;
	public static final char GLFW_KEY_F6 = 295;
	public static final char GLFW_KEY_F7 = 296;
	public static final char GLFW_KEY_F8 = 297;
	public static final char GLFW_KEY_F9 = 298;
	public static final char GLFW_KEY_F10 = 299;
	public static final char GLFW_KEY_F11 = 300;
	public static final char GLFW_KEY_F12 = 301;
	public static final char GLFW_KEY_F13 = 302;
	public static final char GLFW_KEY_F14 = 303;
	public static final char GLFW_KEY_F15 = 304;
	public static final char GLFW_KEY_F16 = 305;
	public static final char GLFW_KEY_F17 = 306;
	public static final char GLFW_KEY_F18 = 307;
	public static final char GLFW_KEY_F19 = 308;
	public static final char GLFW_KEY_F20 = 309;
	public static final char GLFW_KEY_F21 = 310;
	public static final char GLFW_KEY_F22 = 311;
	public static final char GLFW_KEY_F23 = 312;
	public static final char GLFW_KEY_F24 = 313;
	public static final char GLFW_KEY_F25 = 314;
	public static final char GLFW_KEY_KP_0 = 320;
	public static final char GLFW_KEY_KP_1 = 321;
	public static final char GLFW_KEY_KP_2 = 322;
	public static final char GLFW_KEY_KP_3 = 323;
	public static final char GLFW_KEY_KP_4 = 324;
	public static final char GLFW_KEY_KP_5 = 325;
	public static final char GLFW_KEY_KP_6 = 326;
	public static final char GLFW_KEY_KP_7 = 327;
	public static final char GLFW_KEY_KP_8 = 328;
	public static final char GLFW_KEY_KP_9 = 329;
	public static final char GLFW_KEY_KP_DECIMAL = 330;
	public static final char GLFW_KEY_KP_DIVIDE = 331;
	public static final char GLFW_KEY_KP_MULTIPLY = 332;
	public static final char GLFW_KEY_KP_SUBTRACT = 333;
	public static final char GLFW_KEY_KP_ADD = 334;
	public static final char GLFW_KEY_KP_ENTER = 335;
	public static final char GLFW_KEY_KP_EQUAL = 336;
	public static final char GLFW_KEY_LEFT_SHIFT = 340;
	public static final char GLFW_KEY_LEFT_CONTROL = 341;
	public static final char GLFW_KEY_LEFT_ALT = 342;
	public static final char GLFW_KEY_LEFT_SUPER = 343;
	public static final char GLFW_KEY_RIGHT_SHIFT = 344;
	public static final char GLFW_KEY_RIGHT_CONTROL = 345;
	public static final char GLFW_KEY_RIGHT_ALT = 346;
	public static final char GLFW_KEY_RIGHT_SUPER = 347;
	public static final char GLFW_KEY_MENU = 348;

	public static final int GLFW_KEY_LAST = GLFW_KEY_MENU;

	/*! @} */

	/*! @defgroup mods Modifier key flags
	 *  @brief Modifier key flags.
	 *
	 *  See [key input](@ref input_key) for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */

	/*! @brief If this bit is set one or more Shift keys were held down.
	 *
	 *  If this bit is set one or more Shift keys were held down.
	 */
	public static final byte GLFW_MOD_SHIFT = 0x0001;
	/*! @brief If this bit is set one or more Control keys were held down.
	 *
	 *  If this bit is set one or more Control keys were held down.
	 */
	public static final byte GLFW_MOD_CONTROL = 0x0002;
	/*! @brief If this bit is set one or more Alt keys were held down.
	 *
	 *  If this bit is set one or more Alt keys were held down.
	 */
	public static final byte GLFW_MOD_ALT = 0x0004;
	/*! @brief If this bit is set one or more Super keys were held down.
	 *
	 *  If this bit is set one or more Super keys were held down.
	 */
	public static final byte GLFW_MOD_SUPER = 0x0008;
	/*! @brief If this bit is set the Caps Lock key is enabled.
	 *
	 *  If this bit is set the Caps Lock key is enabled and the @ref
	 *  GLFW_LOCK_KEY_MODS input mode is set.
	 */
	public static final byte GLFW_MOD_CAPS_LOCK = 0x0010;
	/*! @brief If this bit is set the Num Lock key is enabled.
	 *
	 *  If this bit is set the Num Lock key is enabled and the @ref
	 *  GLFW_LOCK_KEY_MODS input mode is set.
	 */
	public static final byte GLFW_MOD_NUM_LOCK = 0x0020;

	/*! @} */

	/*! @defgroup buttons Mouse buttons
	 *  @brief Mouse button IDs.
	 *
	 *  See [mouse button input](@ref input_mouse_button) for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */
	public static final byte GLFW_MOUSE_BUTTON_1 = 0;
	public static final byte GLFW_MOUSE_BUTTON_2 = 1;
	public static final byte GLFW_MOUSE_BUTTON_3 = 2;
	public static final byte GLFW_MOUSE_BUTTON_4 = 3;
	public static final byte GLFW_MOUSE_BUTTON_5 = 4;
	public static final byte GLFW_MOUSE_BUTTON_6 = 5;
	public static final byte GLFW_MOUSE_BUTTON_7 = 6;
	public static final byte GLFW_MOUSE_BUTTON_8 = 7;
	public static final int GLFW_MOUSE_BUTTON_LAST = GLFW_MOUSE_BUTTON_8;
	public static final int GLFW_MOUSE_BUTTON_LEFT = GLFW_MOUSE_BUTTON_1;
	public static final int GLFW_MOUSE_BUTTON_RIGHT = GLFW_MOUSE_BUTTON_2;
	public static final int GLFW_MOUSE_BUTTON_MIDDLE = GLFW_MOUSE_BUTTON_3;
	/*! @} */

	/*! @defgroup joysticks Joysticks
	 *  @brief Joystick IDs.
	 *
	 *  See [joystick input](@ref joystick) for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */
	public static final byte GLFW_JOYSTICK_1 = 0;
	public static final byte GLFW_JOYSTICK_2 = 1;
	public static final byte GLFW_JOYSTICK_3 = 2;
	public static final byte GLFW_JOYSTICK_4 = 3;
	public static final byte GLFW_JOYSTICK_5 = 4;
	public static final byte GLFW_JOYSTICK_6 = 5;
	public static final byte GLFW_JOYSTICK_7 = 6;
	public static final byte GLFW_JOYSTICK_8 = 7;
	public static final byte GLFW_JOYSTICK_9 = 8;
	public static final byte GLFW_JOYSTICK_10 = 9;
	public static final byte GLFW_JOYSTICK_11 = 10;
	public static final byte GLFW_JOYSTICK_12 = 11;
	public static final byte GLFW_JOYSTICK_13 = 12;
	public static final byte GLFW_JOYSTICK_14 = 13;
	public static final byte GLFW_JOYSTICK_15 = 14;
	public static final byte GLFW_JOYSTICK_16 = 15;
	public static final int GLFW_JOYSTICK_LAST = GLFW_JOYSTICK_16;
	/*! @} */

	/*! @defgroup gamepad_buttons Gamepad buttons
	 *  @brief Gamepad buttons.
	 *
	 *  See @ref gamepad for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */
	public static final byte GLFW_GAMEPAD_BUTTON_A = 0;
	public static final byte GLFW_GAMEPAD_BUTTON_B = 1;
	public static final byte GLFW_GAMEPAD_BUTTON_X = 2;
	public static final byte GLFW_GAMEPAD_BUTTON_Y = 3;
	public static final byte GLFW_GAMEPAD_BUTTON_LEFT_BUMPER = 4;
	public static final byte GLFW_GAMEPAD_BUTTON_RIGHT_BUMPER = 5;
	public static final byte GLFW_GAMEPAD_BUTTON_BACK = 6;
	public static final byte GLFW_GAMEPAD_BUTTON_START = 7;
	public static final byte GLFW_GAMEPAD_BUTTON_GUIDE = 8;
	public static final byte GLFW_GAMEPAD_BUTTON_LEFT_THUMB = 9;
	public static final byte GLFW_GAMEPAD_BUTTON_RIGHT_THUMB = 10;
	public static final byte GLFW_GAMEPAD_BUTTON_DPAD_UP = 11;
	public static final byte GLFW_GAMEPAD_BUTTON_DPAD_RIGHT = 12;
	public static final byte GLFW_GAMEPAD_BUTTON_DPAD_DOWN = 13;
	public static final byte GLFW_GAMEPAD_BUTTON_DPAD_LEFT = 14;
	public static final int GLFW_GAMEPAD_BUTTON_LAST = GLFW_GAMEPAD_BUTTON_DPAD_LEFT;

	public static final int GLFW_GAMEPAD_BUTTON_CROSS = GLFW_GAMEPAD_BUTTON_A;
	public static final int GLFW_GAMEPAD_BUTTON_CIRCLE = GLFW_GAMEPAD_BUTTON_B;
	public static final int GLFW_GAMEPAD_BUTTON_SQUARE = GLFW_GAMEPAD_BUTTON_X;
	public static final int GLFW_GAMEPAD_BUTTON_TRIANGLE = GLFW_GAMEPAD_BUTTON_Y;
	/*! @} */

	/*! @defgroup gamepad_axes Gamepad axes
	 *  @brief Gamepad axes.
	 *
	 *  See @ref gamepad for how these are used.
	 *
	 *  @ingroup input
	 *  @{ */
	public static final byte GLFW_GAMEPAD_AXIS_LEFT_X = 0;
	public static final byte GLFW_GAMEPAD_AXIS_LEFT_Y = 1;
	public static final byte GLFW_GAMEPAD_AXIS_RIGHT_X = 2;
	public static final byte GLFW_GAMEPAD_AXIS_RIGHT_Y = 3;
	public static final byte GLFW_GAMEPAD_AXIS_LEFT_TRIGGER = 4;
	public static final byte GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER = 5;
	public static final int GLFW_GAMEPAD_AXIS_LAST = GLFW_GAMEPAD_AXIS_RIGHT_TRIGGER;
	/*! @} */

	/*! @defgroup errors Error codes
	 *  @brief Error codes.
	 *
	 *  See [error handling](@ref error_handling) for how these are used.
	 *
	 *  @ingroup init
	 *  @{ */
	/*! @brief No error has occurred.
	 *
	 *  No error has occurred.
	 *
	 *  @analysis Yay.
	 */
	public static final byte GLFW_NO_ERROR = 0;
	/*! @brief GLFW has not been initialized.
	 *
	 *  This occurs if a GLFW function was called that must not be called unless the
	 *  library is [initialized](@ref intro_init).
	 *
	 *  @analysis Application programmer error.  Initialize GLFW before calling any
	 *  function that requires initialization.
	 */
	public static final int GLFW_NOT_INITIALIZED = 0x00010001;
	/*! @brief No context is current for this thread.
	 *
	 *  This occurs if a GLFW function was called that needs and operates on the
	 *  current OpenGL or OpenGL ES context but no context is current on the calling
	 *  thread.  One such function is @ref glfwSwapInterval.
	 *
	 *  @analysis Application programmer error.  Ensure a context is current before
	 *  calling functions that require a current context.
	 */
	public static final int GLFW_NO_CURRENT_CONTEXT = 0x00010002;
	/*! @brief One of the arguments to the function was an invalid enum value.
	 *
	 *  One of the arguments to the function was an invalid enum value, for example
	 *  requesting @ref GLFW_RED_BITS with @ref glfwGetWindowAttrib.
	 *
	 *  @analysis Application programmer error.  Fix the offending call.
	 */
	public static final int GLFW_INVALID_ENUM = 0x00010003;
	/*! @brief One of the arguments to the function was an invalid value.
	 *
	 *  One of the arguments to the function was an invalid value, for example
	 *  requesting a non-existent OpenGL or OpenGL ES version like 2.7.
	 *
	 *  Requesting a valid but unavailable OpenGL or OpenGL ES version will instead
	 *  result in a @ref GLFW_VERSION_UNAVAILABLE error.
	 *
	 *  @analysis Application programmer error.  Fix the offending call.
	 */
	public static final int GLFW_INVALID_VALUE = 0x00010004;
	/*! @brief A memory allocation failed.
	 *
	 *  A memory allocation failed.
	 *
	 *  @analysis A bug in GLFW or the underlying operating system.  Report the bug
	 *  to our [issue tracker](https://github.com/glfw/glfw/issues).
	 */
	public static final int GLFW_OUT_OF_MEMORY = 0x00010005;
	/*! @brief GLFW could not find support for the requested API on the system.
	 *
	 *  GLFW could not find support for the requested API on the system.
	 *
	 *  @analysis The installed graphics driver does not support the requested
	 *  API, or does not support it via the chosen context creation API.
	 *  Below are a few examples.
	 *
	 *  @par
	 *  Some pre-installed Windows graphics drivers do not support OpenGL.  AMD only
	 *  supports OpenGL ES via EGL, while Nvidia and Intel only support it via
	 *  a WGL or GLX extension.  macOS does not provide OpenGL ES at all.  The Mesa
	 *  EGL, OpenGL and OpenGL ES libraries do not interface with the Nvidia binary
	 *  driver.  Older graphics drivers do not support Vulkan.
	 */
	public static final int GLFW_API_UNAVAILABLE = 0x00010006;
	/*! @brief The requested OpenGL or OpenGL ES version is not available.
	 *
	 *  The requested OpenGL or OpenGL ES version (including any requested context
	 *  or framebuffer hints) is not available on this machine.
	 *
	 *  @analysis The machine does not support your requirements.  If your
	 *  application is sufficiently flexible, downgrade your requirements and try
	 *  again.  Otherwise, inform the user that their machine does not match your
	 *  requirements.
	 *
	 *  @par
	 *  Future invalid OpenGL and OpenGL ES versions, for example OpenGL 4.8 if 5.0
	 *  comes out before the 4.x series gets that far, also fail with this error and
	 *  not @ref GLFW_INVALID_VALUE, because GLFW cannot know what future versions
	 *  will exist.
	 */
	public static final int GLFW_VERSION_UNAVAILABLE = 0x00010007;
	/*! @brief A platform-specific error occurred that does not match any of the
	 *  more specific categories.
	 *
	 *  A platform-specific error occurred that does not match any of the more
	 *  specific categories.
	 *
	 *  @analysis A bug or configuration error in GLFW, the underlying operating
	 *  system or its drivers, or a lack of required resources.  Report the issue to
	 *  our [issue tracker](https://github.com/glfw/glfw/issues).
	 */
	public static final int GLFW_PLATFORM_ERROR = 0x00010008;
	/*! @brief The requested format is not supported or available.
	 *
	 *  If emitted during window creation, the requested pixel format is not
	 *  supported.
	 *
	 *  If emitted when querying the clipboard, the contents of the clipboard could
	 *  not be converted to the requested format.
	 *
	 *  @analysis If emitted during window creation, one or more
	 *  [hard constraints](@ref window_hints_hard) did not match any of the
	 *  available pixel formats.  If your application is sufficiently flexible,
	 *  downgrade your requirements and try again.  Otherwise, inform the user that
	 *  their machine does not match your requirements.
	 *
	 *  @par
	 *  If emitted when querying the clipboard, ignore the error or report it to
	 *  the user, as appropriate.
	 */
	public static final int GLFW_FORMAT_UNAVAILABLE = 0x00010009;
	/*! @brief The specified window does not have an OpenGL or OpenGL ES context.
	 *
	 *  A window that does not have an OpenGL or OpenGL ES context was passed to
	 *  a function that requires it to have one.
	 *
	 *  @analysis Application programmer error.  Fix the offending call.
	 */
	public static final int GLFW_NO_WINDOW_CONTEXT = 0x0001000A;
	/*! @brief The specified cursor shape is not available.
	 *
	 *  The specified standard cursor shape is not available, either because the
	 *  current platform cursor theme does not provide it or because it is not
	 *  available on the platform.
	 *
	 *  @analysis Platform or system settings limitation.  Pick another
	 *  [standard cursor shape](@ref shapes) or create a
	 *  [custom cursor](@ref cursor_custom).
	 */
	public static final int GLFW_CURSOR_UNAVAILABLE = 0x0001000B;
	/*! @brief The requested feature is not provided by the platform.
	 *
	 *  The requested feature is not provided by the platform, so GLFW is unable to
	 *  implement it.  The documentation for each function notes if it could emit
	 *  this error.
	 *
	 *  @analysis Platform or platform version limitation.  The error can be ignored
	 *  unless the feature is critical to the application.
	 *
	 *  @par
	 *  A function call that emits this error has no effect other than the error and
	 *  updating any existing out parameters.
	 */
	public static final int GLFW_FEATURE_UNAVAILABLE = 0x0001000C;
	/*! @brief The requested feature is not implemented for the platform.
	 *
	 *  The requested feature has not yet been implemented in GLFW for this platform.
	 *
	 *  @analysis An incomplete implementation of GLFW for this platform, hopefully
	 *  fixed in a future release.  The error can be ignored unless the feature is
	 *  critical to the application.
	 *
	 *  @par
	 *  A function call that emits this error has no effect other than the error and
	 *  updating any existing out parameters.
	 */
	public static final int GLFW_FEATURE_UNIMPLEMENTED = 0x0001000D;
	/*! @brief Platform unavailable or no matching platform was found.
	 *
	 *  If emitted during initialization, no matching platform was found.  If the @ref
	 *  GLFW_PLATFORM init hint was set to `GLFW_ANY_PLATFORM`, GLFW could not detect any of
	 *  the platforms supported by this library binary, except for the Null platform.  If the
	 *  init hint was set to a specific platform, it is either not supported by this library
	 *  binary or GLFW was not able to detect it.
	 *
	 *  If emitted by a native access function, GLFW was initialized for a different platform
	 *  than the function is for.
	 *
	 *  @analysis Failure to detect any platform usually only happens on non-macOS Unix
	 *  systems, either when no window system is running or the program was run from
	 *  a terminal that does not have the necessary environment variables.  Fall back to
	 *  a different platform if possible or notify the user that no usable platform was
	 *  detected.
	 *
	 *  Failure to detect a specific platform may have the same cause as above or be because
	 *  support for that platform was not compiled in.  Call @ref glfwPlatformSupported to
	 *  check whether a specific platform is supported by a library binary.
	 */
	public static final int GLFW_PLATFORM_UNAVAILABLE = 0x0001000E;
	/*! @} */

	/*! @addtogroup window
	 *  @{ */
	/*! @brief Input focus window hint and attribute
	 *
	 *  Input focus [window hint](@ref GLFW_FOCUSED_hint) or
	 *  [window attribute](@ref GLFW_FOCUSED_attrib).
	 */
	public static final int GLFW_FOCUSED = 0x00020001;
	/*! @brief Window iconification window attribute
	 *
	 *  Window iconification [window attribute](@ref GLFW_ICONIFIED_attrib).
	 */
	public static final int GLFW_ICONIFIED = 0x00020002;
	/*! @brief Window resize-ability window hint and attribute
	 *
	 *  Window resize-ability [window hint](@ref GLFW_RESIZABLE_hint) and
	 *  [window attribute](@ref GLFW_RESIZABLE_attrib).
	 */
	public static final int GLFW_RESIZABLE = 0x00020003;
	/*! @brief Window visibility window hint and attribute
	 *
	 *  Window visibility [window hint](@ref GLFW_VISIBLE_hint) and
	 *  [window attribute](@ref GLFW_VISIBLE_attrib).
	 */
	public static final int GLFW_VISIBLE = 0x00020004;
	/*! @brief Window decoration window hint and attribute
	 *
	 *  Window decoration [window hint](@ref GLFW_DECORATED_hint) and
	 *  [window attribute](@ref GLFW_DECORATED_attrib).
	 */
	public static final int GLFW_DECORATED = 0x00020005;
	/*! @brief Window auto-iconification window hint and attribute
	 *
	 *  Window auto-iconification [window hint](@ref GLFW_AUTO_ICONIFY_hint) and
	 *  [window attribute](@ref GLFW_AUTO_ICONIFY_attrib).
	 */
	public static final int GLFW_AUTO_ICONIFY = 0x00020006;
	/*! @brief Window decoration window hint and attribute
	 *
	 *  Window decoration [window hint](@ref GLFW_FLOATING_hint) and
	 *  [window attribute](@ref GLFW_FLOATING_attrib).
	 */
	public static final int GLFW_FLOATING = 0x00020007;
	/*! @brief Window maximization window hint and attribute
	 *
	 *  Window maximization [window hint](@ref GLFW_MAXIMIZED_hint) and
	 *  [window attribute](@ref GLFW_MAXIMIZED_attrib).
	 */
	public static final int GLFW_MAXIMIZED = 0x00020008;
	/*! @brief Cursor centering window hint
	 *
	 *  Cursor centering [window hint](@ref GLFW_CENTER_CURSOR_hint).
	 */
	public static final int GLFW_CENTER_CURSOR = 0x00020009;
	/*! @brief Window framebuffer transparency hint and attribute
	 *
	 *  Window framebuffer transparency
	 *  [window hint](@ref GLFW_TRANSPARENT_FRAMEBUFFER_hint) and
	 *  [window attribute](@ref GLFW_TRANSPARENT_FRAMEBUFFER_attrib).
	 */
	public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;
	/*! @brief Mouse cursor hover window attribute.
	 *
	 *  Mouse cursor hover [window attribute](@ref GLFW_HOVERED_attrib).
	 */
	public static final int GLFW_HOVERED = 0x0002000B;
	/*! @brief Input focus on calling show window hint and attribute
	 *
	 *  Input focus [window hint](@ref GLFW_FOCUS_ON_SHOW_hint) or
	 *  [window attribute](@ref GLFW_FOCUS_ON_SHOW_attrib).
	 */
	public static final int GLFW_FOCUS_ON_SHOW = 0x0002000C;

	/*! @brief Mouse input transparency window hint and attribute
	 *
	 *  Mouse input transparency [window hint](@ref GLFW_MOUSE_PASSTHROUGH_hint) or
	 *  [window attribute](@ref GLFW_MOUSE_PASSTHROUGH_attrib).
	 */
	public static final int GLFW_MOUSE_PASSTHROUGH = 0x0002000D;

	/*! @brief Initial position x-coordinate window hint.
	 *
	 *  Initial position x-coordinate [window hint](@ref GLFW_POSITION_X).
	 */
	public static final int GLFW_POSITION_X = 0x0002000E;

	/*! @brief Initial position y-coordinate window hint.
	 *
	 *  Initial position y-coordinate [window hint](@ref GLFW_POSITION_Y).
	 */
	public static final int GLFW_POSITION_Y = 0x0002000F;

	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_RED_BITS).
	 */
	public static final int GLFW_RED_BITS = 0x00021001;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_GREEN_BITS).
	 */
	public static final int GLFW_GREEN_BITS = 0x00021002;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_BLUE_BITS).
	 */
	public static final int GLFW_BLUE_BITS = 0x00021003;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_ALPHA_BITS).
	 */
	public static final int GLFW_ALPHA_BITS = 0x00021004;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_DEPTH_BITS).
	 */
	public static final int GLFW_DEPTH_BITS = 0x00021005;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_STENCIL_BITS).
	 */
	public static final int GLFW_STENCIL_BITS = 0x00021006;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_ACCUM_RED_BITS).
	 */
	public static final int GLFW_ACCUM_RED_BITS = 0x00021007;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_ACCUM_GREEN_BITS).
	 */
	public static final int GLFW_ACCUM_GREEN_BITS = 0x00021008;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_ACCUM_BLUE_BITS).
	 */
	public static final int GLFW_ACCUM_BLUE_BITS = 0x00021009;
	/*! @brief Framebuffer bit depth hint.
	 *
	 *  Framebuffer bit depth [hint](@ref GLFW_ACCUM_ALPHA_BITS).
	 */
	public static final int GLFW_ACCUM_ALPHA_BITS = 0x0002100A;
	/*! @brief Framebuffer auxiliary buffer hint.
	 *
	 *  Framebuffer auxiliary buffer [hint](@ref GLFW_AUX_BUFFERS).
	 */
	public static final int GLFW_AUX_BUFFERS = 0x0002100B;
	/*! @brief OpenGL stereoscopic rendering hint.
	 *
	 *  OpenGL stereoscopic rendering [hint](@ref GLFW_STEREO).
	 */
	public static final int GLFW_STEREO = 0x0002100C;
	/*! @brief Framebuffer MSAA samples hint.
	 *
	 *  Framebuffer MSAA samples [hint](@ref GLFW_SAMPLES).
	 */
	public static final int GLFW_SAMPLES = 0x0002100D;
	/*! @brief Framebuffer sRGB hint.
	 *
	 *  Framebuffer sRGB [hint](@ref GLFW_SRGB_CAPABLE).
	 */
	public static final int GLFW_SRGB_CAPABLE = 0x0002100E;
	/*! @brief Monitor refresh rate hint.
	 *
	 *  Monitor refresh rate [hint](@ref GLFW_REFRESH_RATE).
	 */
	public static final int GLFW_REFRESH_RATE = 0x0002100F;
	/*! @brief Framebuffer double buffering hint and attribute.
	 *
	 *  Framebuffer double buffering [hint](@ref GLFW_DOUBLEBUFFER_hint) and
	 *  [attribute](@ref GLFW_DOUBLEBUFFER_attrib).
	 */
	public static final int GLFW_DOUBLEBUFFER = 0x00021010;

	/*! @brief Context client API hint and attribute.
	 *
	 *  Context client API [hint](@ref GLFW_CLIENT_API_hint) and
	 *  [attribute](@ref GLFW_CLIENT_API_attrib).
	 */
	public static final int GLFW_CLIENT_API = 0x00022001;
	/*! @brief Context client API major version hint and attribute.
	 *
	 *  Context client API major version [hint](@ref GLFW_CONTEXT_VERSION_MAJOR_hint)
	 *  and [attribute](@ref GLFW_CONTEXT_VERSION_MAJOR_attrib).
	 */
	public static final int GLFW_CONTEXT_VERSION_MAJOR = 0x00022002;
	/*! @brief Context client API minor version hint and attribute.
	 *
	 *  Context client API minor version [hint](@ref GLFW_CONTEXT_VERSION_MINOR_hint)
	 *  and [attribute](@ref GLFW_CONTEXT_VERSION_MINOR_attrib).
	 */
	public static final int GLFW_CONTEXT_VERSION_MINOR = 0x00022003;
	/*! @brief Context client API revision number attribute.
	 *
	 *  Context client API revision number
	 *  [attribute](@ref GLFW_CONTEXT_REVISION_attrib).
	 */
	public static final int GLFW_CONTEXT_REVISION = 0x00022004;
	/*! @brief Context robustness hint and attribute.
	 *
	 *  Context client API revision number [hint](@ref GLFW_CONTEXT_ROBUSTNESS_hint)
	 *  and [attribute](@ref GLFW_CONTEXT_ROBUSTNESS_attrib).
	 */
	public static final int GLFW_CONTEXT_ROBUSTNESS = 0x00022005;
	/*! @brief OpenGL forward-compatibility hint and attribute.
	 *
	 *  OpenGL forward-compatibility [hint](@ref GLFW_OPENGL_FORWARD_COMPAT_hint)
	 *  and [attribute](@ref GLFW_OPENGL_FORWARD_COMPAT_attrib).
	 */
	public static final int GLFW_OPENGL_FORWARD_COMPAT = 0x00022006;
	/*! @brief Debug mode context hint and attribute.
	 *
	 *  Debug mode context [hint](@ref GLFW_CONTEXT_DEBUG_hint) and
	 *  [attribute](@ref GLFW_CONTEXT_DEBUG_attrib).
	 */
	public static final int GLFW_CONTEXT_DEBUG = 0x00022007;
	/*! @brief Legacy name for compatibility.
	 *
	 *  This is an alias for compatibility with earlier versions.
	 */
	public static final int GLFW_OPENGL_DEBUG_CONTEXT = GLFW_CONTEXT_DEBUG;
	/*! @brief OpenGL profile hint and attribute.
	 *
	 *  OpenGL profile [hint](@ref GLFW_OPENGL_PROFILE_hint) and
	 *  [attribute](@ref GLFW_OPENGL_PROFILE_attrib).
	 */
	public static final int GLFW_OPENGL_PROFILE = 0x00022008;
	/*! @brief Context flush-on-release hint and attribute.
	 *
	 *  Context flush-on-release [hint](@ref GLFW_CONTEXT_RELEASE_BEHAVIOR_hint) and
	 *  [attribute](@ref GLFW_CONTEXT_RELEASE_BEHAVIOR_attrib).
	 */
	public static final int GLFW_CONTEXT_RELEASE_BEHAVIOR = 0x00022009;
	/*! @brief Context error suppression hint and attribute.
	 *
	 *  Context error suppression [hint](@ref GLFW_CONTEXT_NO_ERROR_hint) and
	 *  [attribute](@ref GLFW_CONTEXT_NO_ERROR_attrib).
	 */
	public static final int GLFW_CONTEXT_NO_ERROR = 0x0002200A;
	/*! @brief Context creation API hint and attribute.
	 *
	 *  Context creation API [hint](@ref GLFW_CONTEXT_CREATION_API_hint) and
	 *  [attribute](@ref GLFW_CONTEXT_CREATION_API_attrib).
	 */
	public static final int GLFW_CONTEXT_CREATION_API = 0x0002200B;
	/*! @brief Window content area scaling window
	 *  [window hint](@ref GLFW_SCALE_TO_MONITOR).
	 */
	public static final int GLFW_SCALE_TO_MONITOR = 0x0002200C;
	/*! @brief Window framebuffer scaling
	 *  [window hint](@ref GLFW_SCALE_FRAMEBUFFER_hint).
	 */
	public static final int GLFW_SCALE_FRAMEBUFFER = 0x0002200D;
	/*! @brief Legacy name for compatibility.
	 *
	 *  This is an alias for the
	 *  [GLFW_SCALE_FRAMEBUFFER](@ref GLFW_SCALE_FRAMEBUFFER_hint) window hint for
	 *  compatibility with earlier versions.
	 */
	public static final int GLFW_COCOA_RETINA_FRAMEBUFFER = 0x00023001;
	/*! @brief macOS specific
	 *  [window hint](@ref GLFW_COCOA_FRAME_NAME_hint).
	 */
	public static final int GLFW_COCOA_FRAME_NAME = 0x00023002;
	/*! @brief macOS specific
	 *  [window hint](@ref GLFW_COCOA_GRAPHICS_SWITCHING_hint).
	 */
	public static final int GLFW_COCOA_GRAPHICS_SWITCHING = 0x00023003;
	/*! @brief X11 specific
	 *  [window hint](@ref GLFW_X11_CLASS_NAME_hint).
	 */
	public static final int GLFW_X11_CLASS_NAME = 0x00024001;
	/*! @brief X11 specific
	 *  [window hint](@ref GLFW_X11_CLASS_NAME_hint).
	 */
	public static final int GLFW_X11_INSTANCE_NAME = 0x00024002;
	public static final int GLFW_WIN32_KEYBOARD_MENU = 0x00025001;
	/*! @brief Win32 specific [window hint](@ref GLFW_WIN32_SHOWDEFAULT_hint).
	 */
	public static final int GLFW_WIN32_SHOWDEFAULT = 0x00025002;
	/*! @brief Wayland specific
	 *  [window hint](@ref GLFW_WAYLAND_APP_ID_hint).
	 *  
	 *  Allows specification of the Wayland app_id.
	 */
	public static final int GLFW_WAYLAND_APP_ID = 0x00026001;
	/*! @} */

	public static final byte GLFW_NO_API = 0;
	public static final int GLFW_OPENGL_API = 0x00030001;
	public static final int GLFW_OPENGL_ES_API = 0x00030002;

	public static final byte GLFW_NO_ROBUSTNESS = 0;
	public static final int GLFW_NO_RESET_NOTIFICATION = 0x00031001;
	public static final int GLFW_LOSE_CONTEXT_ON_RESET = 0x00031002;

	public static final byte GLFW_OPENGL_ANY_PROFILE = 0;
	public static final int GLFW_OPENGL_CORE_PROFILE = 0x00032001;
	public static final int GLFW_OPENGL_COMPAT_PROFILE = 0x00032002;

	public static final int GLFW_CURSOR = 0x00033001;
	public static final int GLFW_STICKY_KEYS = 0x00033002;
	public static final int GLFW_STICKY_MOUSE_BUTTONS = 0x00033003;
	public static final int GLFW_LOCK_KEY_MODS = 0x00033004;
	public static final int GLFW_RAW_MOUSE_MOTION = 0x00033005;

	public static final int GLFW_CURSOR_NORMAL = 0x00034001;
	public static final int GLFW_CURSOR_HIDDEN = 0x00034002;
	public static final int GLFW_CURSOR_DISABLED = 0x00034003;
	public static final int GLFW_CURSOR_CAPTURED = 0x00034004;

	public static final byte GLFW_ANY_RELEASE_BEHAVIOR = 0;
	public static final int GLFW_RELEASE_BEHAVIOR_FLUSH = 0x00035001;
	public static final int GLFW_RELEASE_BEHAVIOR_NONE = 0x00035002;

	public static final int GLFW_NATIVE_CONTEXT_API = 0x00036001;
	public static final int GLFW_EGL_CONTEXT_API = 0x00036002;
	public static final int GLFW_OSMESA_CONTEXT_API = 0x00036003;

	public static final int GLFW_ANGLE_PLATFORM_TYPE_NONE = 0x00037001;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGL = 0x00037002;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_OPENGLES = 0x00037003;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D9 = 0x00037004;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_D3D11 = 0x00037005;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_VULKAN = 0x00037007;
	public static final int GLFW_ANGLE_PLATFORM_TYPE_METAL = 0x00037008;

	public static final int GLFW_WAYLAND_PREFER_LIBDECOR = 0x00038001;
	public static final int GLFW_WAYLAND_DISABLE_LIBDECOR = 0x00038002;

	public static final int GLFW_ANY_POSITION = 0x80000000;

	/*! @defgroup shapes Standard cursor shapes
	 *  @brief Standard system cursor shapes.
	 *
	 *  These are the [standard cursor shapes](@ref cursor_standard) that can be
	 *  requested from the platform (window system).
	 *
	 *  @ingroup input
	 *  @{ */

	/*! @brief The regular arrow cursor shape.
	 *
	 *  The regular arrow cursor shape.
	 */
	public static final int GLFW_ARROW_CURSOR = 0x00036001;
	/*! @brief The text input I-beam cursor shape.
	 *
	 *  The text input I-beam cursor shape.
	 */
	public static final int GLFW_IBEAM_CURSOR = 0x00036002;
	/*! @brief The crosshair cursor shape.
	 *
	 *  The crosshair cursor shape.
	 */
	public static final int GLFW_CROSSHAIR_CURSOR = 0x00036003;
	/*! @brief The pointing hand cursor shape.
	 *
	 *  The pointing hand cursor shape.
	 */
	public static final int GLFW_POINTING_HAND_CURSOR = 0x00036004;
	/*! @brief The horizontal resize/move arrow shape.
	 *
	 *  The horizontal resize/move arrow shape.  This is usually a horizontal
	 *  double-headed arrow.
	 */
	public static final int GLFW_RESIZE_EW_CURSOR = 0x00036005;
	/*! @brief The vertical resize/move arrow shape.
	 *
	 *  The vertical resize/move shape.  This is usually a vertical double-headed
	 *  arrow.
	 */
	public static final int GLFW_RESIZE_NS_CURSOR = 0x00036006;
	/*! @brief The top-left to bottom-right diagonal resize/move arrow shape.
	 *
	 *  The top-left to bottom-right diagonal resize/move shape.  This is usually
	 *  a diagonal double-headed arrow.
	 *
	 *  @note @macos This shape is provided by a private system API and may fail
	 *  with @ref GLFW_CURSOR_UNAVAILABLE in the future.
	 *
	 *  @note @wayland This shape is provided by a newer standard not supported by
	 *  all cursor themes.
	 *
	 *  @note @x11 This shape is provided by a newer standard not supported by all
	 *  cursor themes.
	 */
	public static final int GLFW_RESIZE_NWSE_CURSOR = 0x00036007;
	/*! @brief The top-right to bottom-left diagonal resize/move arrow shape.
	 *
	 *  The top-right to bottom-left diagonal resize/move shape.  This is usually
	 *  a diagonal double-headed arrow.
	 *
	 *  @note @macos This shape is provided by a private system API and may fail
	 *  with @ref GLFW_CURSOR_UNAVAILABLE in the future.
	 *
	 *  @note @wayland This shape is provided by a newer standard not supported by
	 *  all cursor themes.
	 *
	 *  @note @x11 This shape is provided by a newer standard not supported by all
	 *  cursor themes.
	 */
	public static final int GLFW_RESIZE_NESW_CURSOR = 0x00036008;
	/*! @brief The omni-directional resize/move cursor shape.
	 *
	 *  The omni-directional resize cursor/move shape.  This is usually either
	 *  a combined horizontal and vertical double-headed arrow or a grabbing hand.
	 */
	public static final int GLFW_RESIZE_ALL_CURSOR = 0x00036009;
	/*! @brief The operation-not-allowed shape.
	 *
	 *  The operation-not-allowed shape.  This is usually a circle with a diagonal
	 *  line through it.
	 *
	 *  @note @wayland This shape is provided by a newer standard not supported by
	 *  all cursor themes.
	 *
	 *  @note @x11 This shape is provided by a newer standard not supported by all
	 *  cursor themes.
	 */
	public static final int GLFW_NOT_ALLOWED_CURSOR = 0x0003600A;
	/*! @brief Legacy name for compatibility.
	 *
	 *  This is an alias for compatibility with earlier versions.
	 */
	public static final int GLFW_HRESIZE_CURSOR = GLFW_RESIZE_EW_CURSOR;
	/*! @brief Legacy name for compatibility.
	 *
	 *  This is an alias for compatibility with earlier versions.
	 */
	public static final int GLFW_VRESIZE_CURSOR = GLFW_RESIZE_NS_CURSOR;
	/*! @brief Legacy name for compatibility.
	 *
	 *  This is an alias for compatibility with earlier versions.
	 */
	public static final int GLFW_HAND_CURSOR = GLFW_POINTING_HAND_CURSOR;
	/*! @} */

	public static final int GLFW_CONNECTED = 0x00040001;
	public static final int GLFW_DISCONNECTED = 0x00040002;

	/*! @addtogroup init
	 *  @{ */
	/*! @brief Joystick hat buttons init hint.
	 *
	 *  Joystick hat buttons [init hint](@ref GLFW_JOYSTICK_HAT_BUTTONS).
	 */
	public static final int GLFW_JOYSTICK_HAT_BUTTONS = 0x00050001;
	/*! @brief ANGLE rendering backend init hint.
	 *
	 *  ANGLE rendering backend [init hint](@ref GLFW_ANGLE_PLATFORM_TYPE_hint).
	 */
	public static final int GLFW_ANGLE_PLATFORM_TYPE = 0x00050002;
	/*! @brief Platform selection init hint.
	 *
	 *  Platform selection [init hint](@ref GLFW_PLATFORM).
	 */
	public static final int GLFW_PLATFORM = 0x00050003;
	/*! @brief macOS specific init hint.
	 *
	 *  macOS specific [init hint](@ref GLFW_COCOA_CHDIR_RESOURCES_hint).
	 */
	public static final int GLFW_COCOA_CHDIR_RESOURCES = 0x00051001;
	/*! @brief macOS specific init hint.
	 *
	 *  macOS specific [init hint](@ref GLFW_COCOA_MENUBAR_hint).
	 */
	public static final int GLFW_COCOA_MENUBAR = 0x00051002;
	/*! @brief X11 specific init hint.
	 *
	 *  X11 specific [init hint](@ref GLFW_X11_XCB_VULKAN_SURFACE_hint).
	 */
	public static final int GLFW_X11_XCB_VULKAN_SURFACE = 0x00052001;
	/*! @brief Wayland specific init hint.
	 *
	 *  Wayland specific [init hint](@ref GLFW_WAYLAND_LIBDECOR_hint).
	 */
	public static final int GLFW_WAYLAND_LIBDECOR = 0x00053001;
	/*! @} */

	/*! @addtogroup init
	 *  @{ */
	/*! @brief Hint value that enables automatic platform selection.
	 *
	 *  Hint value for @ref GLFW_PLATFORM that enables automatic platform selection.
	 */
	public static final int GLFW_ANY_PLATFORM = 0x00060000;
	public static final int GLFW_PLATFORM_WIN32 = 0x00060001;
	public static final int GLFW_PLATFORM_COCOA = 0x00060002;
	public static final int GLFW_PLATFORM_WAYLAND = 0x00060003;
	public static final int GLFW_PLATFORM_X11 = 0x00060004;
	public static final int GLFW_PLATFORM_NULL = 0x00060005;

	public static final int GLFW_DONT_CARE = -1;

	static final GLJWLinkedList<GLFWwindow> WINDOWS_OBJECTS;

	/**
	 * This function resets all window hints to their default values.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwDefaultWindowHints() {
		try {
			glfwDefaultWindowHints.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	}private static final MethodHandle glfwDefaultWindowHints;

	/**
	 * This function initializes the GLFW library. Before most GLFW functions can be used, GLFW must be initialized, and before an application terminates GLFW should be terminated in order to free any resources allocated during or after initialization.
	 * If this function fails, it calls glfwTerminate before returning. If it succeeds, you should call {@link GLFW#glfwTerminate()} before the application exits.
	 * Additional calls to this function after successful initialization but before termination will return {@link GLFW#GLFW_TRUE} immediately.
	 * 
	 * Returns
	 * {@link GLFW#GLFW_TRUE} if successful, or {@link GLFW#GLFW_FALSE} if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * macOS: This function will change the current directory of the application to the Contents/Resources subdirectory of the application's bundle, if present. 
	 * This can be disabled with the {@link GLFW#GLFW_COCOA_CHDIR_RESOURCES} init hint.
	 * X11: This function will set the LC_CTYPE category of the application locale according to the current environment if that category is still "C". 
	 * This is because the "C" locale breaks Unicode text input.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * See also {@link GLFW#glfwTerminate()}
	 * @since Added in version 1.0.
	 * */
	public static int glfwInit() {
		try {
			int init = (int)glfwInit.invoke();
			if (init == GLFW_TRUE) {
				glfwSetErrorCallback.invoke(Callbacks.errorCallbackAddress);
				glfwSetMonitorCallback.invoke(Callbacks.monitorCallbackAddress);
				glfwSetJoystickCallback.invoke(Callbacks.joystickCallbackAddress);	
			}
			return init;
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwInit;

	public static long glfwCreateWindow(int w, int h, CharSequence title, long monitor, long share){
		try(BytePointer p_title = BytePointer.allocUTF8(title)){
			return glfwCreateWindow(w, h, p_title.address(), monitor, share);
		}
	} private static final MethodHandle glfwCreateWindow;

	/**
	 * This function creates a window and its associated OpenGL or OpenGL ES context. 
	 * Most of the options controlling how the window and its context should be created are specified with window hints.
	 * Successful creation does not change which context is current. Before you can use the newly created context, you need to make it current. 
	 * For information about the share parameter, see Context object sharing.
	 * The created window, framebuffer and context may differ from what you requested, as not all parameters and hints are hard constraints. 
	 * This includes the size of the window, especially for full screen windows. To query the actual attributes of the created window, framebuffer and context, see {@link GLFW#glfwGetWindowAttrib(long, int)}, {@link GLFW#glfwGetWindowSize(long, long, long)} and {@link GLFW#glfwGetFramebufferSize(long, long, long)}.
	 * To create a full screen window, you need to specify the monitor the window will cover. If no monitor is specified, the window will be windowed mode. 
	 * Unless you have a way for the user to choose a specific monitor, it is recommended that you pick the primary monitor. For more information on how to query connected monitors, see Retrieving monitors.
	 * For full screen windows, the specified size becomes the resolution of the window's desired video mode. 
	 * As long as a full screen window is not iconified, the supported video mode most closely matching the desired video mode is set for the specified monitor. 
	 * For more information about full screen windows, including the creation of so called windowed full screen or borderless full screen windows, see "Windowed full screen" windows.
	 * Once you have created the window, you can switch it between windowed and full screen mode with glfwSetWindowMonitor. This will not affect its OpenGL or OpenGL ES context.
	 * By default, newly created windows use the placement recommended by the window system. To create the window at a specific position, make it initially invisible using the GLFW_VISIBLE window hint, set its position and then show it.
	 * As long as at least one full screen window is not iconified, the screensaver is prohibited from starting.
	 * Window systems put limits on window sizes. Very large or very small window dimensions may be overridden by the window system on creation. Check the actual size after creation.
	 * The swap interval is not set during window creation and the initial value may vary depending on driver settings and defaults.
	 * 
	 * @param width		The desired width, in screen coordinates, of the window. This must be greater than zero.
	 * @param height	The desired height, in screen coordinates, of the window. This must be greater than zero.
	 * @param title		The initial, UTF-8 encoded window title.
	 * @param monitor	The monitor to use for full screen mode, or NULL for windowed mode.
	 * @param share		The window whose context to share resources with, or NULL to not share resources.
	 * 
	 * @return The handle of the created window, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM}, {@link GLFW#GLFW_INVALID_VALUE}, {@link GLFW#GLFW_API_UNAVAILABLE}, {@link GLFW#GLFW_VERSION_UNAVAILABLE}, {@link GLFW#GLFW_FORMAT_UNAVAILABLE}, {@link GLFW#GLFW_NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Windows: Window creation will fail if the Microsoft GDI software OpenGL implementation is the only one available.
	 * Windows: If the executable has an icon resource named GLFW_ICON, it will be set as the initial icon for the window. If no such icon is present, the IDI_APPLICATION icon will be used instead. To set a different icon, see {@link GLFW#glfwSetWindowIcon(long, GLFWimage)}.
	 * Windows: The context to share resources with must not be current on any other thread.
	 * 
	 * macOS: The OS only supports forward-compatible core profile contexts for OpenGL versions 3.2 and later. Before creating an OpenGL context of version 3.2 or later you must set the {@link GLFW#GLFW_OPENGL_FORWARD_COMPAT} and {@link GLFW#GLFW_OPENGL_PROFILE} hints accordingly. OpenGL 3.0 and 3.1 contexts are not supported at all on macOS.
	 * macOS: The GLFW window has no icon, as it is not a document window, but the dock icon will be the same as the application bundle's icon. For more information on bundles, see the Bundle Programming Guide in the Mac Developer Library.
	 * macOS: The first time a window is created the menu bar is created. If GLFW finds a MainMenu.nib it is loaded and assumed to contain a menu bar. Otherwise a minimal menu bar is created manually with common commands like Hide, Quit and About. The About entry opens a minimal about dialog with information from the application's bundle. Menu bar creation can be disabled entirely with the {@link GLFW#GLFW_COCOA_MENUBAR} init hint.
	 * macOS: On OS X 10.10 and later the window frame will not be rendered at full resolution on Retina displays unless the {@link GLFW#GLFW_COCOA_RETINA_FRAMEBUFFER} hint is {@link GLFW#GLFW_TRUE} and the NSHighResolutionCapable key is enabled in the application bundle's Info.plist. For more information, see High Resolution Guidelines for OS X in the Mac Developer Library. The GLFW test and example programs use a custom Info.plist template for this, which can be found as CMake/MacOSXBundleInfo.plist.in in the source tree.
	 * macOS: When activating frame autosaving with {@link GLFW#GLFW_COCOA_FRAME_NAME}, the specified window size and position may be overridden by previously saved values.
	 * 
	 * X11: Some window managers will not respect the placement of initially hidden windows.
	 * X11: Due to the asynchronous nature of X11, it may take a moment for a window to reach its requested state. This means you may not be able to query the final size, position or other attributes directly after window creation.
	 * X11: The class part of the WM_CLASS window property will by default be set to the window title passed to this function. The instance part will use the contents of the RESOURCE_NAME environment variable, if present and not empty, or fall back to the window title. Set the {@link GLFW#GLFW_X11_CLASS_NAME} and {@link GLFW#GLFW_X11_INSTANCE_NAME} window hints to override this.
	 * 
	 * Wayland: Compositors should implement the xdg-decoration protocol for GLFW to decorate the window properly. If this protocol isn't supported, or if the compositor prefers client-side decorations, a very simple fallback frame will be drawn using the wp_viewporter protocol. A compositor can still emit close, maximize or fullscreen events, using for instance a keybind mechanism. If neither of these protocols is supported, the window won't be decorated.
	 * Wayland: A full screen window will not attempt to change the mode, no matter what the requested size or refresh rate.
	 * Wayland: Screensaver inhibition requires the idle-inhibit protocol to be implemented in the user's compositor.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * See also {@link GLFW#glfwDestroyWindow(long)}
	 * 
	 * @since Added in version 3.0. Replaces glfwOpenWindow.
	 * */
	@SuppressWarnings("removal")
	public static long glfwCreateWindow(int w, int h, @Ctype("char* ") long title, long monitor, long share){
		try {
			@Ctype("GLFWwindow*")
			long window = (long)glfwCreateWindow.invoke(w, h, title, monitor, share);
			WINDOWS_OBJECTS.add(new GLFWwindow(window));
			{
				glfwSetWindowPosCallback.invoke(window, Callbacks.windowPosCallbackAddress);
				glfwSetWindowSizeCallback.invoke(window, Callbacks.windowSizeCallbackAddress);
				glfwSetWindowCloseCallback.invoke(window, Callbacks.windowCloseCallbackAddress);
				glfwSetWindowRefreshCallback.invoke(window, Callbacks.windowRefreshCallbackAddress);
				glfwSetWindowFocusCallback.invoke(window, Callbacks.windowFocusCallbackAddress);
				glfwSetWindowIconifyCallback.invoke(window, Callbacks.windowIconifyCallbackAddress);
				glfwSetWindowMaximizeCallback.invoke(window, Callbacks.windowMaximizeCallbackAddress);
				glfwSetFramebufferSizeCallback.invoke(window, Callbacks.framebufferSizeCallbackAddress);
				glfwSetWindowContentScaleCallback.invoke(window, Callbacks.windowContentScaleCallbackAddress);
				glfwSetKeyCallback.invoke(window, Callbacks.keyCallback);
				glfwSetCharCallback.invoke(window, Callbacks.charCallbackAddress);
				glfwSetCharModsCallback.invoke(window, Callbacks.charModsCallbackAddress);
				glfwSetMouseButtonCallback.invoke(window, Callbacks.mouseButtonCallbackAddress);
				glfwSetCursorPosCallback.invoke(window, Callbacks.cursorPosCallbackAddress);
				glfwSetCursorEnterCallback.invoke(window, Callbacks.cursorEnterCallbackAddress);
				glfwSetScrollCallback.invoke(window, Callbacks.scrollCallbackAddress);
				glfwSetDropCallback.invoke(window, Callbacks.dropCallbackAddress);
			}
			return window;
		} catch (Throwable e) {throw new RuntimeException(e);}	
	}
	
	/**
	 * This function destroys all remaining windows and cursors, restores any modified gamma ramps and frees any other allocated resources. 
	 * Once this function is called, you must again call {@link GLFW#glfwInit()} successfully before you will be able to use most GLFW functions.
	 * If GLFW has been successfully initialized, this function should be called before the application exits. 
	 * If initialization fails, there is no need to call this function, as it is called by {@link GLFW#glfwInit()} before it returns failure.
	 * 
	 * Remarks
	 * This function may be called before {@link GLFW#glfwInit()}.
	 * 
	 * Warning
	 * No window's context may be current on another thread when this function is called.
	 * 
	 * Reentrancy
	 * This function may not be called from a callback.
	 * 
	 * Thread Safety
	 * This function may only be called from the main thread.
	 * 
	 * See also {@link GLFW#glfwInit()}
	 * 
	 * @since Added in GLFW 1.0.
	 * */
	public static void glfwTerminate() {
		try {
			errorCallbackImpl = null;
			monitorCallbackImpl = null;
			WINDOWS_OBJECTS.clear();
			glfwTerminate.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwTerminate;

	/**
	 * This function retrieves the major, minor and revision numbers of the GLFW library. 
	 * It is intended for when you are using GLFW as a shared library and want to ensure that you are using the minimum required version.
	 * Any or all of the version arguments may be NULL.
	 * 
	 * @param major$ - Where to store the major version number, or NULL
	 * @param minor$ - Where to store the minor version number, or NULL
	 * @param revision$ - Where to store the revision version number, or NULL
	 * 
	 * @since Added in version 1.0.
	 * */
	public static void glfwGetVersion(
			@Nullable @Ctype("int*") long major, 
			@Nullable @Ctype("int*") long minor, 
			@Nullable @Ctype("int*") long revision) {
		try {
			glfwGetVersion.invoke(major, minor, revision);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetVersion;

	/**@see {@link GLFW#glfwGetVersion(long, long, long)}*/
	public static void glfwGetVersion(final IntPointer major, final IntPointer minor, final IntPointer revision) {
		glfwGetVersion(major != null ? major.address() : 0, minor != null ? minor.address() : 0, revision != null ? revision.address() : 0);
	} 

	/**
	 * This function sets hints for the next call to glfwCreateWindow. 
	 * The hints, once set, retain their values until changed by a call to this function or {@link GLFW#glfwDefaultWindowHints()}, or until the library is terminated.
	 * Only integer value hints can be set with this function. String value hints are set with {@link GLFW#glfwWindowHintString(int, CharSequence)}.
	 * This function does not check whether the specified hint values are valid. 
	 * If you set hints to invalid values this will instead be reported by the next call to {@link GLFW#glfwCreateWindow(int, int, CharSequence, long, long)}.
	 * Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. 
	 * Other platforms will ignore them. Setting these hints requires no platform specific headers or functions.
	 * 
	 * @param hint	The window hint to set.
	 * @param value	The new value of the window hint.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. 
	 * */
	public static void glfwWindowHint(int hint, int value) {
		try {
			glfwWindowHint.invoke(hint, value);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwWindowHint;

	/**
	 * This function sets hints for the next call to glfwCreateWindow. 
	 * The hints, once set, retain their values until changed by a call to this function or {@link GLFW#glfwDefaultWindowHints()}, or until the library is terminated.
	 * Only string type hints can be set with this function. Integer value hints are set with {@link GLFW#glfwWindowHint(int, int)}.
	 * This function does not check whether the specified hint values are valid. 
	 * If you set hints to invalid values this will instead be reported by the next call to {@link GLFW#glfwCreateWindow(int, int, CharSequence, long, long)}.
	 * Some hints are platform specific. These may be set on any platform but they will only affect their specific platform. 
	 * Other platforms will ignore them. Setting these hints requires no platform specific headers or functions.
	 * 
	 * @param hint	The window hint to set.
	 * @param value	The new value of the window hint.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Pointer lifetime
	 * The specified string is copied before this function returns.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3
	 * */
	public static void glfwWindowHintString(int hint, @Ctype("char*") long value) {
		try {
			glfwWindowHintString.invoke(hint, value);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwWindowHintString;

	/**@see {@link GLFW#glfwWindowHintString(int, long)}*/
	public static void glfwWindowHintString(int hint, CharSequence seq) {
		try(BytePointer string = BytePointer.allocUTF8(seq)){
			glfwWindowHintString(hint, string.address());
		}
	} 

	/**
	 * This function destroys the specified window and its context. On calling this function, no further callbacks will be called for that window.
	 * If the context of the specified window is current on the main thread, it is detached before being destroyed.
	 * @param window$ The window to destroy.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Reentrancy
	 * This function must not be called from a callback.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwDestroyWindow(@Ctype("GLFWwindow*") long window) {
		try {
			final Iterator<GLFWwindow> it = WINDOWS_OBJECTS.iterator();
			while (it.hasNext()) {
				final GLFWwindow windowObj = it.next();
				if (windowObj.pointer() == window) {
					it.remove();
					break;
				}
			}			
			glfwDestroyWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwDestroyWindow;

	/**
	 * This function returns the value of the close flag of the specified window.
	 * @param window The window to query.
	 * 
	 * @return The value of the close flag.
	 *
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static boolean glfwWindowShouldClose	(@Ctype("GLFWwindow*") long window) {
		try {
			return (int)glfwWindowShouldClose.invoke(window) > 0;
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwWindowShouldClose;	

	/**
	 * This function sets the value of the close flag of the specified window. 
	 * This can be used to override the user's attempt to close the window, or to signal that it should be closed.
	 * 
	 * @param window The window whose flag to change.
	 * @param value	The new value.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwSetWindowShouldClose(@Ctype("GLFWwindow*") long window, int value) {
		try {
			glfwSetWindowShouldClose.invoke(window, value);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowShouldClose;	

	/**@see {@link GLFW#glfwSetWindowShouldClose(long, int)}*/
	public static void glfwSetWindowShouldClose(@Ctype("GLFWwindow*") long window, boolean value) {
		glfwSetWindowShouldClose(window, value == true ? GLFW_TRUE : GLFW_FALSE);
	}

	/**
	 * This function returns the window title, encoded as UTF-8, of the specified window. This is the title set previously by glfwCreateWindow or glfwSetWindowTitle.
	 * 
	 * @param window	The window to query.
	 * 
	 * Returns
	 * The UTF-8 encoded window title, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}
	 * 
	 * Remarks
	 * The returned title is currently a copy of the title last set by glfwCreateWindow or glfwSetWindowTitle. It does not include any additional text which may be appended by the platform or another program.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to glfwGetWindowTitle or glfwSetWindowTitle, or until the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.4.
	 * */
	public static @Ctype("const char*") long glfwGetWindowTitle(@Ctype("GLFWwindow*") long window){
		try {
			return (long)glfwGetWindowTitle.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowTitle;

	/**
	 * This function sets the window title, encoded as UTF-8, of the specified window.
	 * 
	 * @param window The window whose title to change.
	 * @param title	The UTF-8 encoded window title.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and  {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * macOS: The window title will not be updated until the next time you process events.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0.
	 * */
	public static void glfwSetWindowTitle(@Ctype("GLFWwindow*") long window, @Ctype("const char*") long title) {
		try {
			glfwSetWindowTitle.invoke(window, title);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowTitle;

	/**@see {@link GLFW#glfwSetWindowTitle(long, long)}*/
	public static void glfwSetWindowTitle(@Ctype("GLFWwindow*") long window, CharSequence title) {
		try (BytePointer $title = BytePointer.allocUTF8(title)){
			glfwSetWindowTitle(window, $title.address());
		}
	}

	/**
	 * This function sets the icon of the specified window. If passed an array of candidate images, those of or closest to the sizes desired by the system are selected. 
	 * If no images are specified, the window reverts to its default icon.
	 * The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. 
	 * They are arranged canonically as packed sequential rows, starting from the top-left corner.
	 * The desired image sizes varies depending on platform and system settings. The selected images will be rescaled as needed. Good sizes include 16x16, 32x32 and 48x48.
	 * 
	 * @param window	The window whose icon to set.
	 * @param count		The number of images in the specified array, or zero to revert to the default window icon.
	 * @param images 	The images to create the icon from. This is ignored if count is zero.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and  {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The specified image data is copied before this function returns.
	 * 
	 * Remarks
	 * macOS: The GLFW window has no icon, as it is not a document window, so this function does nothing. The dock icon will be the same as the application bundle's icon. For more information on bundles, see the Bundle Programming Guide in the Mac Developer Library.
	 * Wayland: There is no existing protocol to change an icon, the window will thus inherit the one defined in the application's desktop file. This function always emits GLFW_PLATFORM_ERROR.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static void glfwSetWindowIcon(@Ctype("GLFWwindow*") long window, int count, @Ctype("const GLFWimage*") long images) {
		try {
			glfwSetWindowIcon.invoke(window, count, images);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowIcon;

	/**@see GLFW#glfwSetWindowIcon(long, int, long)*/
	public static void glfwSetWindowIcon(@Ctype("GLFWwindow*") long window, GLFWimage image) {
		try {
			glfwSetWindowIcon.invoke(window, 1, image.address());
		} catch (Throwable e) {e.printStackTrace();}
	} 

	/**
	 * This function retrieves the position, in screen coordinates, of the upper-left corner of the content area of the specified window.
	 * Any or all of the position arguments may be NULL. If an error occurs, all non-NULL position arguments will be set to zero.
	 * 
	 * @param	window	The window to query.
	 * @param	xpos	Where to store the x-coordinate of the upper-left corner of the content area, or NULL.
	 * @param	ypos	Where to store the y-coordinate of the upper-left corner of the content area, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: There is no way for an application to retrieve the global position of its windows, this function will always emit GLFW_PLATFORM_ERROR.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 *
	 * @since Added in version 3.0.
	 * */
	public static void glfwGetWindowPos(@Ctype("GLFWwindow*") long window, @Ctype("int*") long xpos, @Ctype("int*") long ypos) {
		try {
			glfwGetWindowPos.invoke(window, xpos, ypos);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowPos;	

	/**@see GLFW#glfwGetWindowPos(long, long, long)*/
	public static void glfwGetWindowPos(@Ctype("GLFWwindow*") long window, IntPointer xpos, IntPointer ypos) {
		glfwGetWindowPos(window, xpos.address(), ypos.address());
	}

	/**
	 * This function sets the position, in screen coordinates, of the upper-left corner of the content area of the specified windowed mode window. If the window is a full screen window, this function does nothing.
	 * Do not use this function to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the user.
	 * The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.
	 * 
	 * @param window	The window to query.
	 * @param xpos	The x-coordinate of the upper-left corner of the content area.
	 * @param ypos	The y-coordinate of the upper-left corner of the content area.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: There is no way for an application to set the global position of its windows, this function will always emit GLFW_PLATFORM_ERROR.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwSetWindowPos(@Ctype("GLFWwindow*") long window, int xpos, int ypos) {
		try {
			glfwSetWindowPos.invoke(window, xpos, ypos);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowPos;

	/**
	 * This function sets the position, in screen coordinates, of the upper-left corner of the content area of the specified windowed mode window. If the window is a full screen window, this function does nothing.
	 * Do not use this function to move an already visible window unless you have very good reasons for doing so, as it will confuse and annoy the user.
	 * The window manager may put limits on what positions are allowed. GLFW cannot and should not override these limits.
	 * 
	 * @param	window	The window to query.
	 * @param	The x-coordinate of the upper-left corner of the content area.
	 * @param	The y-coordinate of the upper-left corner of the content area.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: There is no way for an application to set the global position of its windows, this function will always emit GLFW_PLATFORM_ERROR.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 *
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwGetWindowSize(@Ctype("GLFWwindow*") long window, @Ctype("int*") long width, @Ctype("int*") long height) {
		try {
			glfwGetWindowSize.invoke(window, width, height);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowSize;

	/**@see GLFW#glfwGetWindowSize(long, long, long)*/
	public static void glfwGetWindowSize(@Ctype("GLFWwindow*") long window, IntPointer width, IntPointer height) {
		glfwGetWindowSize(window, width.address(), height.address());
	}

	/**
	 * This function sets the size limits of the content area of the specified window. 
	 * If the window is full screen, the size limits only take effect once it is made windowed. If the window is not resizable, this function does nothing.
	 * The size limits are applied immediately to a windowed mode window and may cause it to be resized.
	 * The maximum dimensions must be greater than or equal to the minimum dimensions and all must be greater than or equal to zero.
	 * 
	 * @param window	The window to set limits for.
	 * @param minwidth	The minimum width, in screen coordinates, of the content area, or  {@link GLFW#GLFW_DONT_CARE}
	 * @param minheight	The minimum height, in screen coordinates, of the content area, or {@link GLFW#GLFW_DONT_CARE}
	 * @param maxwidth	The maximum width, in screen coordinates, of the content area, or  {@link GLFW#GLFW_DONT_CARE}
	 * @param maxheight	The maximum height, in screen coordinates, of the content area, or {@link GLFW#GLFW_DONT_CARE}
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * If you set size limits and an aspect ratio that conflict, the results are undefined.
	 * Wayland: The size limits will not be applied until the window is actually resized, either by the user or by the compositor.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static void glfwSetWindowSizeLimits(@Ctype("GLFWwindow*") long window, int minwidth, int minheight, int maxwidth, int maxheight) {
		try {
			glfwSetWindowSizeLimits.invoke(window, minwidth, minheight, maxwidth, maxheight);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowSizeLimits;

	/**
	 * This function sets the required aspect ratio of the content area of the specified window. If the window is full screen, the aspect ratio only takes effect once it is made windowed. If the window is not resizable, this function does nothing.
	 * The aspect ratio is specified as a numerator and a denominator and both values must be greater than zero. For example, the common 16:9 aspect ratio is specified as 16 and 9, respectively.
	 * If the numerator and denominator is set to GLFW_DONT_CARE then the aspect ratio limit is disabled.
	 * The aspect ratio is applied immediately to a windowed mode window and may cause it to be resized.
	 * 
	 * @param window	The window to set limits for.
	 * @param numer		The numerator of the desired aspect ratio, or GLFW_DONT_CARE.
	 * @param denom		The denominator of the desired aspect ratio, or GLFW_DONT_CARE.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 *   
	 * Remarks
	 * If you set size limits and an aspect ratio that conflict, the results are undefined.
	 * Wayland: The aspect ratio will not be applied until the window is actually resized, either by the user or by the compositor.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static void glfwSetWindowAspectRatio(@Ctype("GLFWwindow*") long window, int numer, int denom) {
		try {
			glfwSetWindowAspectRatio.invoke(window, numer, denom);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowAspectRatio;

	/**
	 * This function sets the size, in screen coordinates, of the content area of the specified window.
	 * For full screen windows, this function updates the resolution of its desired video mode and switches to the video mode closest to it, without affecting the window's context. 
	 * As the context is unaffected, the bit depths of the framebuffer remain unchanged.
	 * If you wish to update the refresh rate of the desired video mode in addition to its resolution, see glfwSetWindowMonitor.
	 * The window manager may put limits on what sizes are allowed. GLFW cannot and should not override these limits.
	 * 
	 * @param window	The window to resize.
	 * @param width		The desired width, in screen coordinates, of the window content area.
	 * @param height	The desired height, in screen coordinates, of the window content area.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 *  
	 * Remarks
	 * Wayland: A full screen window will not attempt to change the mode, no matter what the requested size.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwSetWindowSize(@Ctype("GLFWwindow*") long window, int width, int height) {
		try {
			glfwSetWindowSize.invoke(window, width, height);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowSize;

	/**
	 * This function retrieves the size, in pixels, of the framebuffer of the specified window. 
	 * If you wish to retrieve the size of the window in screen coordinates, see glfwGetWindowSize.
	 * Any or all of the size arguments may be NULL. If an error occurs, all non-NULL size arguments will be set to zero.
	 * 
	 * @param window	The window whose framebuffer to query.
	 * @param width		Where to store the width, in pixels, of the framebuffer, or NULL.
	 * @param height	Where to store the height, in pixels, of the framebuffer, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 *  
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwGetFramebufferSize(@Ctype("GLFWwindow*") long window, @Ctype("int*") long width, @Ctype("int*") long height) {
		try {
			glfwGetFramebufferSize.invoke(window, width, height);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetFramebufferSize;

	/**@see GLFW#glfwGetFramebufferSize(long, long, long)*/
	public static void glfwGetFramebufferSize(@Ctype("GLFWwindow*") long window, IntPointer width, IntPointer height) {
		glfwGetFramebufferSize(window, width.address(), height.address());
	}

	/**
	 * This function retrieves the size, in screen coordinates, of each edge of the frame of the specified window. 
	 * This size includes the title bar, if the window has one. The size of the frame may vary depending on the window-related hints used to create it.
	 * Because this function retrieves the size of each window frame edge and not the offset along a particular coordinate axis, the retrieved values will always be zero or positive.
	 * Any or all of the size arguments may be NULL. If an error occurs, all non-NULL size arguments will be set to zero.
	 * 
	 * 
	 * @param window	The window whose frame size to query.
	 * @param left		Where to store the size, in screen coordinates, of the left edge of the window frame, or NULL.
	 * @param top		Where to store the size, in screen coordinates, of the top edge of the window frame, or NULL.
	 * @param right		Where to store the size, in screen coordinates, of the right edge of the window frame, or NULL.
	 * @param bottom	Where to store the size, in screen coordinates, of the bottom edge of the window frame, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.1.
	 * */
	public static void glfwGetWindowFrameSize(
			@Ctype("GLFWwindow") long window, 
			@Ctype("int*") long left, 
			@Ctype("int*") long top, 
			@Ctype("int*") long right, 
			@Ctype("int*") long bottom) {
		try {
			glfwGetWindowFrameSize.invoke(window, left, top, right, bottom);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowFrameSize;

	/**@see GLFW#glfwGetWindowFrameSize(long, long, long, long, long)*/
	public static void glfwGetWindowFrameSize(@Ctype("GLFWwindow") long window, IntPointer left, IntPointer top, IntPointer right, IntPointer bottom) {
		glfwGetWindowFrameSize(window, left.address(), top.address(), right.address(), bottom.address());
	}

	/**
	 * This function retrieves the content scale for the specified window. 
	 * The content scale is the ratio between the current DPI and the platform's default DPI. This is especially important for text and any UI elements. 
	 * If the pixel dimensions of your UI scaled by this look appropriate on your machine then it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. 
	 * This relies on the system DPI and scaling settings being somewhat correct.
	 * On systems where each monitors can have its own content scale, the window content scale will depend on which monitor the system considers the window to be on.
	 * 
	 * @param window	The window to query.
	 * @param xscale	Where to store the x-axis content scale, or NULL.
	 * @param yscale	Where to store the y-axis content scale, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwGetWindowContentScale(@Ctype("GLFWwindow*") long window, @Ctype("float*") long xscale, @Ctype("float*") long yscale) {
		try {
			glfwGetWindowContentScale.invoke(window, xscale, yscale);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowContentScale;

	/**@see GLFW#glfwGetWindowContentScale(long, long, long)*/
	public static void glfwGetWindowContentScale(@Ctype("GLFWwindow*") long window, FloatPointer xscale, FloatPointer yscale) {
		glfwGetWindowContentScale(window, xscale.address(), yscale.address());
	}

	/**
	 * This function returns the opacity of the window, including any decorations.
	 * The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque. If the system does not support whole window transparency, this function always returns one.
	 * The initial opacity value for newly created windows is one.
	 * 
	 * @param window	The window to query.
	 * 
	 * @return The opacity value of the specified window.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static float glfwGetWindowOpacity(@Ctype("GLFWwindow") long window) {
		try {
			return (float)glfwGetWindowOpacity.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowOpacity;

	/**
	 * This function sets the opacity of the window, including any decorations.
	 * The opacity (or alpha) value is a positive finite number between zero and one, where zero is fully transparent and one is fully opaque.
	 * The initial opacity value for newly created windows is one.
	 * A window created with framebuffer transparency may not use whole window transparency. The results of doing this are undefined.
	 * 
	 * @param window	The window to set the opacity for.
	 * @param opacity	The desired opacity of the specified window.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwSetWindowOpacity (@Ctype("GLFWwindow") long window, float opacity) {
		try {
			glfwSetWindowOpacity.invoke(window, opacity);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowOpacity;


	/**
	 * This function iconifies (minimizes) the specified window if it was previously restored. If the window is already iconified, this function does nothing.
	 * If the specified window is a full screen window, GLFW restores the original video mode of the monitor. The window's desired video mode is set again when the window is restored.
	 * 
	 * @param window	The window to iconify.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 2.1. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwIconifyWindow(@Ctype("GLFWwindow*") long window) {
		try {
			glfwIconifyWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwIconifyWindow;


	/**
	 * This function restores the specified window if it was previously iconified (minimized) or maximized. If the window is already restored, this function does nothing.
	 * If the specified window is an iconified full screen window, its desired video mode is set again for its monitor when the window is restored.
	 * 
	 * @param window	The window to restore.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 2.1. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwRestoreWindow(@Ctype("GLFWwindow*") long window) {
		try {
			glfwRestoreWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwRestoreWindow;

	/**
	 * This function maximizes the specified window if it was previously not maximized. If the window is already maximized, this function does nothing.
	 * If the specified window is a full screen window, this function does nothing.
	 * 
	 * @param window	The window to maximize.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread Safety
	 * This function may only be called from the main thread.
	 * 
	 * @since Added in GLFW 3.2.
	 * */
	public static void glfwMaximizeWindow (@Ctype("GLFWwindow*") long window) {
		try {
			glfwMaximizeWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwMaximizeWindow;

	/**
	 * This function makes the specified window visible if it was previously hidden. If the window is already visible or is in full screen mode, this function does nothing.
	 * By default, windowed mode windows are focused when shown Set the {@link GLFW#GLFW_FOCUS_ON_SHOW} window hint to change this behavior for all newly created windows, or change the behavior for an existing window with {@link GLFW#glfwSetWindowAttrib}.
	 * 
	 * @param window	The window to make visible.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: Because Wayland wants every frame of the desktop to be complete, this function does not immediately make the window visible. Instead it will become visible the next time the window framebuffer is updated after this call.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwShowWindow(@Ctype("GLFWwindow*") long window) {
		try {
			glfwShowWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwShowWindow;

	/**
	 * This function hides the specified window if it was previously visible. 
	 * If the window is already hidden or is in full screen mode, this function does nothing.
	 * 
	 * @param window	The window to hide.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwHideWindow (@Ctype("GLFWwindow*") long window) {
		try {
			glfwHideWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwHideWindow;

	/**
	 * This function brings the specified window to front and sets input focus. The window should already be visible and not iconified.
	 * By default, both windowed and full screen mode windows are focused when initially created. Set the {@link GLFW#GLFW_FOCUSED} to disable this behavior.
	 * Also by default, windowed mode windows are focused when shown with glfwShowWindow. Set the GLFW_FOCUS_ON_SHOW to disable this behavior.
	 * Do not use this function to steal focus from other applications unless you are certain that is what the user wants. Focus stealing can be extremely disruptive.
	 * For a less disruptive way of getting the user's attention, see attention requests.
	 * 
	 * @param window The window to give input focus.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: It is not possible for an application to bring its windows to front, this function will always emit {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 3.2.
	 * */
	public static void glfwFocusWindow (@Ctype("GLFWwindow*") long window) {
		try {
			glfwFocusWindow.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwFocusWindow;

	/**
	 * This function requests user attention to the specified window. On platforms where this is not supported, attention is requested to the application as a whole.
	 * Once the user has given attention, usually by focusing the window or application, the system will end the request automatically.
	 * 
	 * @param window The window to request attention to.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * macOS: Attention is requested to the application as a whole, not the specific window.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwRequestWindowAttention(@Ctype("GLFWwindow*") long window) {
		try {
			glfwRequestWindowAttention.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwRequestWindowAttention;

	/**
	 * This function returns the handle of the monitor that the specified window is in full screen on.
	 * 
	 * @param window	The window to query.
	 * 
	 * Returns
	 * The monitor, or NULL if the window is in windowed mode or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. 
	 * */
	public static @Ctype("GLFWmonitor*") long glfwGetWindowMonitor(@Ctype("GLFWwindow*") long window) {
		try {
			return (long)glfwGetWindowMonitor.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowMonitor;

	/**
	 * This function sets the monitor that the window uses for full screen mode or, if the monitor is NULL, makes it windowed mode.
	 * When setting a monitor, this function updates the width, height and refresh rate of the desired video mode and switches to the video mode closest to it. 
	 * The window position is ignored when setting a monitor.
	 * When the monitor is NULL, the position, width and height are used to place the window content area. The refresh rate is ignored when no monitor is specified.
	 * If you only wish to update the resolution of a full screen window or the size of a windowed mode window, see glfwSetWindowSize.
	 * When a window transitions from full screen to windowed mode, this function restores any previous window settings such as whether it is decorated, floating, resizable, has size or aspect ratio limits, etc.
	 * 
	 * @param window		The window whose monitor, size or video mode to set.
	 * @param monitor		The desired monitor, or NULL to set windowed mode.
	 * @param xpos			The desired x-coordinate of the upper-left corner of the content area.
	 * @param ypos			The desired y-coordinate of the upper-left corner of the content area.
	 * @param width			The desired with, in screen coordinates, of the content area or video mode.
	 * @param height		The desired height, in screen coordinates, of the content area or video mode.
	 * @param refreshRate	The desired refresh rate, in Hz, of the video mode, or GLFW_DONT_CARE.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * The OpenGL or OpenGL ES context will not be destroyed or otherwise affected by any resizing or mode switching, although you may need to update your viewport if the framebuffer size has changed.
	 * Wayland: The desired window position is ignored, as there is no way for an application to set this property.
	 * Wayland: Setting the window to full screen will not attempt to change the mode, no matter what the requested size or refresh rate.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static void glfwSetWindowMonitor(@Ctype("GLFWwindow*") long window, @Ctype("GLFWmonitor*") long monitor, int xpos, int ypos, int width, int height, int refreshRate) {
		try {
			glfwSetWindowMonitor.invoke(window, monitor, xpos, ypos, width, height, refreshRate);
		} catch (Throwable e) {e.printStackTrace();}
	} private static final MethodHandle glfwSetWindowMonitor;


	/**
	 * This function returns the value of an attribute of the specified window or its OpenGL or OpenGL ES context.
	 * 
	 * @param window	The window to query.
	 * @param attrib	The window attribute whose value to return.
	 * 
	 * @return The value of the attribute, or zero if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 *   
	 * Remarks
	 * Framebuffer related hints are not window attributes. See Framebuffer related attributes for more information.
	 * Zero is a valid value for many window and context related attributes so you cannot use a return value of zero as an indication of errors. 
	 * However, this function should not fail as long as it is passed valid arguments and the library has been initialized.
	 * Wayland: The Wayland protocol provides no way to check whether a window is iconfied, so {@link GLFW#GLFW_ICONIFIED} always returns {@link GLFW#GLFW_FALSE}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 3.0. Replaces glfwGetWindowParam and glfwGetGLVersion.
	 * */
	public static int glfwGetWindowAttrib(@Ctype("GLFWwindow*") long window, int attrib) {
		try {
			return (int)glfwGetWindowAttrib.invoke(window, attrib);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowAttrib;

	/**
	 * This function sets the value of an attribute of the specified window.
	 * The supported attributes are {@link GLFW#GLFW_DECORATED}, {@link GLFW#GLFW_RESIZABLE}, {@link GLFW#GLFW_FLOATING}, {@link GLFW#GLFW_AUTO_ICONIFY} and {@link GLFW#GLFW_FOCUS_ON_SHOW}.
	 * Some of these attributes are ignored for full screen windows. The new value will take effect if the window is later made windowed.
	 * Some of these attributes are ignored for windowed mode windows. The new value will take effect if the window is later made full screen.
	 * 
	 * @param window The window to set the attribute for.
	 * @param attrib A supported window attribute.
	 * @param value	 {@link GLFW#GLFW_TRUE} or {@link GLFW#GLFW_FALSE}.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM}, {@link GLFW#GLFW_INVALID_VALUE}, {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Calling glfwGetWindowAttrib will always return the latest value, even if that value is ignored by the current mode of the window.
	 * Wayland: The {@link GLFW#GLFW_FLOATING} window attribute is not supported. Setting this will emit {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwSetWindowAttrib(@Ctype("GLFWwindow*") long window, int attrib, int value) {
		try {
			glfwSetWindowAttrib.invoke(window, attrib, value);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowAttrib;

	/**
	 * This function sets the user-defined pointer of the specified window. The current value is retained until the window is destroyed. The initial value is NULL.
	 * 
	 * @param window	The window whose pointer to set.
	 * @param pointer	The new value.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwSetWindowUserPointer(@Ctype("GLFWwindow*") long window, @Ctype("void*") long pointer) {
		try {
			glfwSetWindowUserPointer.invoke(window, pointer);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetWindowUserPointer;

	/**@see GLFW#glfwSetWindowUserPointer(long, long)*/
	public static void glfwSetWindowUserPointer(@Ctype("GLFWwindow*") long window, VoidPointer pointer) {
		glfwSetWindowUserPointer(window, pointer.address());
	}

	/**
	 * This function returns the current value of the user-defined pointer of the specified window. The initial value is NULL.
	 * 
	 * @param window The window whose pointer to return.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("void*") long glfwGetWindowUserPointer (@Ctype("GLFWwindow*") long window) {
		try {
			return (long)glfwGetWindowUserPointer.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetWindowUserPointer;

	/**
	 * This function processes only those events that are already in the event queue and then returns immediately. 
	 * Processing events will cause the window and input callbacks associated with those events to be called.
	 * On some platforms, a window move, resize or menu operation will cause event processing to block. 
	 * This is due to how event processing is designed on those platforms. 
	 * You can use the window refresh callback to redraw the contents of your window when necessary during such operations.
	 * Do not assume that callbacks you set will only be called in response to event processing functions like this one. 
	 * While it is necessary to poll for events, window systems that require GLFW to register callbacks of its own can pass events to GLFW in response to many window system function calls. 
	 * GLFW will pass those events on to the application callbacks before returning.
	 * Event processing is not required for joystick input to work.
	 *
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Reentrancy
	 * This function must not be called from a callback.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0.
	 * */
	public static void glfwPollEvents () {
		try {
			glfwPollEvents.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwPollEvents;

	/**
	 * This function swaps the front and back buffers of the specified window when rendering with OpenGL or OpenGL ES. 
	 * If the swap interval is greater than zero, the GPU driver waits the specified number of screen updates before swapping the buffers.
	 * The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link GLFW#GLFW_NO_WINDOW_CONTEXT} error.
	 * This function does not apply to Vulkan. If you are rendering with Vulkan, see vkQueuePresentKHR instead.
	 * 
	 * @param window	The window whose buffers to swap.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * EGL: The context of the specified window must be current on the calling thread.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static void glfwSwapBuffers(@Ctype("GLFWwindow*") long window) {
		try {
			glfwSwapBuffers.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSwapBuffers;

	/**
	 * This function sets the swap interval for the current OpenGL or OpenGL ES context, i.e. the number of screen updates to wait from the time {@link GLFW#glfwSwapBuffers(long)} was called before swapping the buffers and returning. 
	 * This is sometimes called vertical synchronization, vertical retrace synchronization or just vsync.
	 * A context that supports either of the WGL_EXT_swap_control_tear and GLX_EXT_swap_control_tear extensions also accepts negative swap intervals, which allows the driver to swap immediately even if a frame arrives a little bit late. 
	 * You can check for these extensions with {@link GLFW#glfwExtensionSupported(long)}.
	 * A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFW#GLFW_NO_CURRENT_CONTEXT} error.
	 * This function does not apply to Vulkan. If you are rendering with Vulkan, see the present mode of your swapchain instead.
	 * 
	 * @param interval	The minimum number of screen updates to wait for until the buffers are swapped by {@link GLFW#glfwSwapBuffers(long)}.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_NO_CURRENT_CONTEXT} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * This function is not called during context creation, leaving the swap interval set to whatever is the default on that platform. 
	 * This is done because some swap interval extensions used by GLFW do not allow the swap interval to be reset to zero once it has been set to a non-zero value.
	 * Some GPU drivers do not honor the requested swap interval, either because of a user setting that overrides the application's request or due to bugs in the driver.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwSwapBuffers(long)}
	 * 
	 * @since Added in version 1.0.
	 * */
	public static void glfwSwapInterval(int interval) {
		try {
			glfwSwapInterval.invoke(interval);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSwapInterval;

	/**
	 * This function sets the position callback of the specified window, which is called when the window is moved. 
	 * The callback is provided with the position, in screen coordinates, of the upper-left corner of the content area of the window.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature 
	 * void function_name(GLFWwindow* window, int xpos, int ypos)
	 * 
	 * For more information about the callback parameters, see the function pointer type.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Remarks
	 * Wayland: This callback will never be called, as there is no way for an application to know its global position.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * See also
	 * @since Added in version 3.0.
	 * */
	public static IWindowPosCallback glfwSetWindowPosCallback(@Ctype("GLFWwindow*") long window, IWindowPosCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowPosCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowPosCallback; 

	/**
	 * This function sets the size callback of the specified window, which is called when the window is resized. 
	 * The callback is provided with the size, in screen coordinates, of the content area of the window.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature 
	 * void function_name(GLFWwindow* window, int width, int height)
	 * For more information about the callback parameters, see the function pointer type.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter and return value.
	 * */
	public static IWindowSizeCallback glfwSetWindowSizeCallback(@Ctype("GLFWwindow*") long window, IWindowSizeCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowSizeCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowSizeCallback;		

	/**
	 * This function sets the close callback of the specified window, which is called when the user attempts to close the window, for example by clicking the close widget in the title bar.
	 * The close flag is set before this callback is called, but you can modify it at any time with glfwSetWindowShouldClose.
	 * The close callback is not triggered by glfwDestroyWindow.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature 
	 * void function_name(GLFWwindow* window)
	 * For more information about the callback parameters, see the function pointer type.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Remarks
	 * macOS: Selecting Quit from the application menu will trigger the close callback for all windows.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 2.5. GLFW 3: Added window handle parameter and return value.
	 * */
	public static IWindowCloseCallback glfwSetWindowCloseCallback(@Ctype("GLFWwindow*") long window, IWindowCloseCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowCloseCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowCloseCallback;	

	/**
	 * This function sets the refresh callback of the specified window, which is called when the content area of the window needs to be redrawn, for example if the window has been exposed after having been covered by another window.
	 * On compositing window systems such as Aero, Compiz, Aqua or Wayland, where the window contents are saved off-screen, this callback may be called only very infrequently or never at all.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature 
	 * void function_name(GLFWwindow* window);
	 * 
	 * For more information about the callback parameters, see the function pointer type.
	 *
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 2.5. GLFW 3: Added window handle parameter and return value.
	 * */
	public static IWindowRefreshCallback glfwSetWindowRefreshCallback(@Ctype("GLFWwindow*") long window, IWindowRefreshCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowRefreshCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowRefreshCallback;	

	/**
	 * This function sets the focus callback of the specified window, which is called when the window gains or loses input focus.
	 * After the focus callback is called for a window that lost input focus, synthetic key and mouse button release events will be generated for all such that had been pressed. 
	 * For more information, see glfwSetKeyCallback and glfwSetMouseButtonCallback.
	 * 
	 * Parameters
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * Returns
	 * The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int focused)
	 * 
	 * For more information about the callback parameters, see the function pointer type.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static IWindowFocusCallback glfwSetWindowFocusCallback(@Ctype("GLFWwindow*") long window, IWindowFocusCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowFocusCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowFocusCallback;	

	/**
	 * This function sets the iconification callback of the specified window, which is called when the window is iconified or restored.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int iconified)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static IWindowIconifyCallback glfwSetWindowIconifyCallback(@Ctype("GLFWwindow*") long window, IWindowIconifyCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowIconifyCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowIconifyCallback;		

	/**
	 * This function sets the maximization callback of the specified window, which is called when the window is maximized or restored.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int maximized)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static IWindowMaximizeCallback glfwSetWindowMaximizeCallback	(@Ctype("GLFWwindow*") long window, IWindowMaximizeCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowMaximizeCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowMaximizeCallback;	

	/**
	 * This function sets the framebuffer resize callback of the specified window, which is called when the framebuffer of the specified window is resized.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int width, int height)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static IFramebufferSizeCallback glfwSetFramebufferSizeCallback(@Ctype("GLFWwindow*") long window, IFramebufferSizeCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setFramebufferSizeCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetFramebufferSizeCallback;

	/**
	 * This function sets the window content scale callback of the specified window, which is called when the content scale of the specified window changes.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return
	 * The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, float xscale, float yscale)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwGetWindowContentScale(long, long, long)}
	 * 
	 * @since Added in version 3.3.
	 * */
	public static IWindowContentScaleCallback glfwSetWindowContentScaleCallback	(@Ctype("GLFWwindow*") long window, IWindowContentScaleCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setWindowContentScaleCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetWindowContentScaleCallback;	

	/**
	 * This function puts the calling thread to sleep until at least one event is available in the event queue.
	 * Once one or more events are available, it behaves exactly like glfwPollEvents, i.e. the events in the queue are processed and the function then returns immediately. 
	 * Processing events will cause the window and input callbacks associated with those events to be called.
	 * Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all callbacks.
	 * On some platforms, a window move, resize or menu operation will cause event processing to block. This is due to how event processing is designed on those platforms. 
	 * You can use the window refresh callback to redraw the contents of your window when necessary during such operations.
	 * Do not assume that callbacks you set will only be called in response to event processing functions like this one.
	 *  While it is necessary to poll for events, window systems that require GLFW to register callbacks of its own can pass events to GLFW in response to many window system function calls. GLFW will pass those events on to the application callbacks before returning.
	 *  Event processing is not required for joystick input to work.
	 *  
	 *  Errors
	 *  Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 *  
	 *  Reentrancy
	 *  This function must not be called from a callback.
	 *  
	 *  Thread safety
	 *  This function must only be called from the main thread.
	 *  
	 *  @see {@link GLFW#glfwPollEvents(long)}, {@link GLFW#glfwWaitEventsTimeout(double)}
	 *  
	 *  @since Added in version 2.5.
	 * */
	public static void glfwWaitEvents() {
		try {
			glfwWaitEvents.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwWaitEvents;

	/**
	 * This function puts the calling thread to sleep until at least one event is available in the event queue, or until the specified timeout is reached. 
	 * If one or more events are available, it behaves exactly like glfwPollEvents, i.e. the events in the queue are processed and the function then returns immediately.
	 *  Processing events will cause the window and input callbacks associated with those events to be called.
	 * The timeout value must be a positive finite number.
	 * Since not all events are associated with callbacks, this function may return without a callback having been called even if you are monitoring all callbacks.
	 * On some platforms, a window move, resize or menu operation will cause event processing to block. 
	 * This is due to how event processing is designed on those platforms. You can use the window refresh callback to redraw the contents of your window when necessary during such operations.
	 * Do not assume that callbacks you set will only be called in response to event processing functions like this one. 
	 * While it is necessary to poll for events, window systems that require GLFW to register callbacks of its own can pass events to GLFW in response to many window system function calls. 
	 * GLFW will pass those events on to the application callbacks before returning.
	 * Event processing is not required for joystick input to work.
	 * 
	 * @param timeout	The maximum amount of time, in seconds, to wait.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Reentrancy
	 * This function must not be called from a callback.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwPollEvents(long)}, {@link GLFW#glfwWaitEvents()} 
	 * 
	 * @since Added in version 3.2.
	 * */
	public static void glfwWaitEventsTimeout(double timeout) {
		try {
			glfwWaitEventsTimeout.invoke(timeout);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwWaitEventsTimeout;

	/**
	 * This function posts an empty event from the current thread to the event queue, causing glfwWaitEvents or glfwWaitEventsTimeout to return.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwWaitEvents()}, {@link GLFW#glfwWaitEventsTimeout(double)}
	 * 
	 * @since Added in version 3.1.
	 * */
	public static void glfwPostEmptyEvent() {
		try {
			glfwPostEmptyEvent.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwPostEmptyEvent;

	/**
	 * This function makes the OpenGL or OpenGL ES context of the specified window current on the calling thread. 
	 * It can also detach the current context from the calling thread without making a new one current by passing in NULL.
	 * A context must only be made current on a single thread at a time and each thread can have only a single current context at a time. 
	 * Making a context current detaches any previously current context on the calling thread.
	 * When moving a context between threads, you must detach it (make it non-current) on the old thread before making it current on the new one.
	 * By default, making a context non-current implicitly forces a pipeline flush. 
	 * On machines that support GL_KHR_context_flush_control, you can control whether a context performs this flush by setting the {@link GLFW#GLFW_CONTEXT_RELEASE_BEHAVIOR} hint.
	 * The specified window must have an OpenGL or OpenGL ES context. Specifying a window without a context will generate a {@link GLFW#GLFW_NO_WINDOW_CONTEXT} error.
	 * 
	 * @param window The window whose context to make current, or NULL to detach the current context.
	 * 
	 * Remarks
	 * If the previously current context was created via a different context creation API than the one passed to this function, GLFW will still detach the previous one from its API before making the new one current.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwGetCurrentContext()}	
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwMakeContextCurrent(@Ctype("GLFWwindow*") long window) {
		try {
			glfwMakeContextCurrent.invoke(window);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwMakeContextCurrent;

	/**
	 * This function returns the window whose OpenGL or OpenGL ES context is current on the calling thread.
	 * 
	 * @return The window whose context is current, or NULL if no window's context is current.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwMakeContextCurrent(long)}
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("GLFWwindow*") long glfwGetCurrentContext() {
		try {
			return (long)glfwGetCurrentContext.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetCurrentContext;

	/**
	 * This function returns whether the specified API extension is supported by the current OpenGL or OpenGL ES context. 
	 * It searches both for client API extension and context creation API extensions.
	 * A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFW#GLFW_NO_CURRENT_CONTEXT} error.
	 * As this functions retrieves and searches one or more extension strings each call, it is recommended that you cache its results if it is going to be used frequently. 
	 * The extension strings will not change during the lifetime of a context, so there is no danger in doing this.
	 * This function does not apply to Vulkan. If you are using Vulkan, see glfwGetRequiredInstanceExtensions, vkEnumerateInstanceExtensionProperties and vkEnumerateDeviceExtensionProperties instead.
	 * 
	 * @param extension The ASCII encoded name of the extension.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if the extension is available, or {@link GLFW#GLFW_FALSE} otherwise.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_NO_CURRENT_CONTEXT}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwGetProcAddress(long)}
	 * 
	 * @since Added in version 1.0.
	 * */
	public static int glfwExtensionSupported(@Ctype("const char*") long extension) {
		try {
			return (int)glfwExtensionSupported.invoke(extension);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwExtensionSupported;

	/**@see GLFW#glfwExtensionSupported(BytePointer))*/
	public static int glfwExtensionSupported(CharSequence extension) {
		try(BytePointer extension$ = BytePointer.allocUTF8(extension)){
			return glfwExtensionSupported(extension$);
		}
	}

	/**@see GLFW#glfwExtensionSupported(long)*/
	public static int glfwExtensionSupported(BytePointer extension) {
		return glfwExtensionSupported(extension.address());
	}

	/**
	 * This function returns the address of the specified OpenGL or OpenGL ES core or extension function, if it is supported by the current context.
	 * A context must be current on the calling thread. Calling this function without a current context will cause a {@link GLFW#GLFW_NO_CURRENT_CONTEXT} error.
	 * This function does not apply to Vulkan. If you are rendering with Vulkan, see glfwGetInstanceProcAddress, vkGetInstanceProcAddr and vkGetDeviceProcAddr instead.
	 * 
	 * @param	procname The ASCII encoded name of the function.
	 * 
	 * @return The address of the function, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_NO_CURRENT_CONTEXT} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * The address of a given function is not guaranteed to be the same between contexts.
	 * This function may return a non-NULL address despite the associated version or extension not being available. Always check the context version or extension string first.
	 * 
	 * Pointer lifetime
	 * The returned function pointer is valid until the context is destroyed or the library is terminated.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * @see {@link GLFW#glfwExtensionSupported(CharSequence))}
	 * 
	 * @since Added in version 1.0.
	 * */
	public static @Ctype("GLFWglproc") long glfwGetProcAddress(@Ctype("const char*") long procname) {
		try {
			return (long)glfwGetProcAddress.invoke(procname);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetProcAddress;

	/**@see GLFW#glfwGetProcAddress(BytePointer))*/
	public static @Ctype("GLFWglproc") long glfwGetProcAddress(@Ctype("const char*") CharSequence procname) {
		try(BytePointer procname$ = BytePointer.allocUTF8(procname)){
			return glfwGetProcAddress(procname$);
		}
	}

	/**@see GLFW#glfwGetProcAddress(long)*/
	public static @Ctype("GLFWglproc") long glfwGetProcAddress(@Ctype("const char*") BytePointer procname) {
		return glfwGetProcAddress(procname.address());
	}

	/**
	 * Global glfw-error handling object
	 * @see {@link GLFW#glfwSetErrorCallback(IErrorCallback)}
	 * */
	static IErrorCallback errorCallbackImpl;

	/**
	 * This function sets the error callback, which is called with an error code and a human-readable description each time a GLFW error occurs.
	 * The error code is set before the callback is called. Calling glfwGetError from the error callback will return the same value as the error code argument.
	 * The error callback is called on the thread where the error occurred. If you are using GLFW from multiple threads, your error callback needs to be written accordingly.
	 * Because the description string may have been generated specifically for that error, it is not guaranteed to be valid after the callback has returned. 
	 * If you wish to use it after the callback returns, you need to make a copy.
	 * Once set, the error callback remains set even after the library has been terminated.
	 * 
	 * 
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set.
	 * 
	 * Callback signature
	 * void callback_name(int error_code, const char* description)
	 * For more information about the callback parameters, see the callback pointer type.
	 * 
	 * Errors
	 * None.
	 * 
	 * Remarks
	 * This function may be called before {@link GLFW#glfwInit()}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwGetError(long)}
	 * @since Added in version 3.0.
	 * */
	public static IErrorCallback glfwSetErrorCallback(IErrorCallback callback) {
		IErrorCallback tmp = errorCallbackImpl;
		errorCallbackImpl = callback;
		return tmp;
	} private static final MethodHandle glfwSetErrorCallback;	

	/**
	 * This function returns and clears the error code of the last error that occurred on the calling thread, and optionally a UTF-8 encoded human-readable description of it. 
	 * If no error has occurred since the last call, it returns {@link GLFW#GLFW_NO_ERROR} (zero) and the description pointer is set to NULL.
	 * 
	 * @param description Where to store the error description pointer, or NULL.
	 * 
	 * @return The last error code for the calling thread, or {@link GLFW#GLFW_NO_ERROR} (zero).
	 * 
	 * Errors
	 * None.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the next error occurs or the library is terminated.
	 * 
	 * Remarks
	 * This function may be called before {@link GLFW#glfwInit()}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see {@link GLFW#glfwSetErrorCallback(IErrorCallback)}
	 * 
	 * @since Added in version 3.3.
	 * */
	public static int glfwGetError(@Ctype("const char**") long description) {
		try {
			return (int)glfwGetError.invoke(description);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetError;	

	/**
	 * This function returns an array of handles for all currently connected monitors. 
	 * The primary monitor is always first in the returned array. 
	 * If no monitors were found, this function returns NULL.
	 * 
	 * @param count	Where to store the number of monitors in the returned array. This is set to zero if an error occurred.
	 * 
	 * @return An array of monitor handles, or NULL if no monitors were found or if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the monitor configuration changes or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwGetPrimaryMonitor()}
	 * 
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("GLFWmonitor**") long glfwGetMonitors(@Ctype("int*") long count) {
		try {
			return (long)glfwGetMonitors.invoke(count);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitors;

	/**@see GLFW#glfwGetMonitors(long)*/
	public static @Ctype("GLFWmonitor**") long glfwGetMonitors(IntPointer count) {
		return glfwGetMonitors(count.address());
	}

	/**
	 * This function returns the primary monitor. This is usually the monitor where elements like the task bar or global menu bar are located.
	 * 
	 * @return The primary monitor, or NULL if no monitors were found or if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * Remarks
	 * The primary monitor is always first in the array returned by glfwGetMonitors.
	 * 
	 * @see GLFW#glfwGetMonitors(long)
	 * 
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("GLFWmonitor*") long glfwGetPrimaryMonitor() {
		try {
			return (long)glfwGetPrimaryMonitor.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetPrimaryMonitor;

	/**
	 * This function returns the position, in screen coordinates, of the upper-left corner of the specified monitor.
	 * Any or all of the position arguments may be NULL. If an error occurs, all non-NULL position arguments will be set to zero.
	 * 
	 * @param monitor	The monitor to query.
	 * @param xpos		Where to store the monitor x-coordinate, or NULL.
	 * @param ypos		Where to store the monitor y-coordinate, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static void glfwGetMonitorPos(@Ctype("GLFWmonitor*") long monitor, @Ctype("int*") long xpos, @Ctype("int*") long ypos) {
		try {
			glfwGetMonitorPos.invoke(monitor, xpos, ypos);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorPos;

	/**@see GLFW#glfwGetMonitorPos(long, long, long)*/
	public static void glfwGetMonitorPos(@Ctype("GLFWmonitor*") long monitor, IntPointer xpos, IntPointer ypos) {
		glfwGetMonitorPos(monitor, xpos.address(), ypos.address());
	}

	/**
	 * This function returns the position, in screen coordinates, of the upper-left corner of the work area of the specified monitor along with the work area size in screen coordinates. 
	 * The work area is defined as the area of the monitor not occluded by the operating system task bar where present. 
	 * If no task bar exists then the work area is the monitor resolution in screen coordinates.
	 * Any or all of the position and size arguments may be NULL. If an error occurs, all non-NULL position and size arguments will be set to zero.
	 * 
	 * @param monitor	The monitor to query.
	 * @param xpos		Where to store the monitor x-coordinate, or NULL.
	 * @param ypos		Where to store the monitor y-coordinate, or NULL.
	 * @param width		Where to store the monitor width, or NULL.
	 * @param height	Where to store the monitor height, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwGetMonitorWorkarea (
			@Ctype("GLFWmonitor*") long monitor, 
			@Ctype("int*") long xpos, 
			@Ctype("int*") long ypos, 
			@Ctype("int*") long width, 
			@Ctype("int*") long height) {
		try {
			glfwGetMonitorWorkarea.invoke(monitor, xpos, ypos, width, height);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorWorkarea;

	/**@see GLFW#glfwGetMonitorWorkarea(long, long, long, long, long)*/
	public static void glfwGetMonitorWorkarea (@Ctype("GLFWmonitor*") long monitor, IntPointer xpos, IntPointer ypos, IntPointer width, IntPointer height) {
		glfwGetMonitorWorkarea(monitor, xpos.address(), ypos.address(), width.address(), height.address());
	}

	/**
	 * This function returns the size, in millimetres, of the display area of the specified monitor.
	 * Some systems do not provide accurate monitor size information, either because the monitor EDID data is incorrect or because the driver does not report it accurately.
	 * Any or all of the size arguments may be NULL. If an error occurs, all non-NULL size arguments will be set to zero.
	 *
	 * @param monitor	The monitor to query.
	 * @param widthMM	Where to store the width, in millimetres, of the monitor's display area, or NULL.
	 * @param heightMM	Where to store the height, in millimetres, of the monitor's display area, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Remarks
	 * Windows: On Windows 8 and earlier the physical size is calculated from the current resolution and system DPI instead of querying the monitor EDID data.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 3.0.
	 * */
	public static void glfwGetMonitorPhysicalSize (@Ctype("GLFWmonitor*") long monitor, @Ctype("int*") long widthMM, @Ctype("int*") long heightMM) {
		try {
			glfwGetMonitorPhysicalSize.invoke(monitor, widthMM, heightMM);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorPhysicalSize;

	/**@see GLFW#glfwGetMonitorPhysicalSize(long, long, long)*/
	public static void glfwGetMonitorPhysicalSize (@Ctype("GLFWmonitor*") long monitor, IntPointer widthMM, IntPointer heightMM) {
		glfwGetMonitorPhysicalSize(monitor, widthMM.address(), heightMM.address());
	}

	/**
	 * This function retrieves the content scale for the specified monitor. The content scale is the ratio between the current DPI and the platform's default DPI. 
	 * This is especially important for text and any UI elements. 
	 * If the pixel dimensions of your UI scaled by this look appropriate on your machine then it should appear at a reasonable size on other machines regardless of their DPI and scaling settings. 
	 * This relies on the system DPI and scaling settings being somewhat correct.
	 * The content scale may depend on both the monitor resolution and pixel density and on user settings. 
	 * It may be very different from the raw DPI calculated from the physical size and current resolution.
	 * 
	 * @param monitor	The monitor to query.
	 * @param xscale	Where to store the x-axis content scale, or NULL.
	 * @param yscale	Where to store the y-axis content scale, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwGetWindowContentScale(long, long, long)
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwGetMonitorContentScale (@Ctype("GLFWmonitor*") long monitor, @Ctype("float*") long xscale, @Ctype("float*") long yscale) {
		try {
			glfwGetMonitorContentScale.invoke(monitor, xscale, yscale);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorContentScale;

	/**@see GLFW#glfwGetMonitorContentScale(long, long, long)*/
	public static void glfwGetMonitorContentScale (@Ctype("GLFWmonitor*") long monitor, FloatPointer xscale, FloatPointer yscale) {
		glfwGetMonitorContentScale(monitor, xscale.address(), yscale.address());
	}

	/**
	 * This function returns a human-readable name, encoded as UTF-8, of the specified monitor. 
	 * The name typically reflects the make and model of the monitor and is not guaranteed to be unique among the connected monitors.
	 * 
	 * @param monitor	The monitor to query.
	 * 
	 * @return The UTF-8 encoded name of the monitor, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. 
	 * */
	public static @Ctype("const char*") long glfwGetMonitorName(@Ctype("GLFWmonitor*") long monitor) {
		try {
			return (long)glfwGetMonitorName.invoke(monitor);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorName;

	/**@see GLFW#glfwGetMonitorName(long)e*/
	public static String glfwGetMonitorNameUTF8(@Ctype("GLFWmonitor*") long monitor) {
		//The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified monitor is disconnected or the library is terminated.
		return BytePointer.asAddress(glfwGetMonitorName(monitor)).toUTF8();
	}

	/**
	 * This function sets the user-defined pointer of the specified monitor. 
	 * The current value is retained until the monitor is disconnected. The initial value is NULL.
	 * This function may be called from the monitor callback, even for a monitor that is being disconnected.
	 * 
	 * @param monitor	The monitor whose pointer to set.
	 * @param pointer	The new value.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @see GLFW#glfwGetMonitorUserPointer(long);
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwSetMonitorUserPointer(@Ctype("GLFWmonitor*") long monitor, @Ctype("void*") long pointer) {
		try {
			glfwSetMonitorUserPointer.invoke(monitor, pointer);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetMonitorUserPointer;

	/**@see GLFW#glfwSetMonitorUserPointer(long, long)*/
	public static void glfwSetMonitorUserPointer (@Ctype("GLFWmonitor*") long monitor, VoidPointer pointer) {
		glfwSetMonitorUserPointer(monitor, pointer.address());
	}

	/**
	 * This function returns the current value of the user-defined pointer of the specified monitor. The initial value is NULL.
	 * This function may be called from the monitor callback, even for a monitor that is being disconnected.
	 * 
	 * @param monitor The monitor whose pointer to return.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @see GLFW#glfwSetMonitorUserPointer(long, long)
	 * 
	 * @since Added in version 3.3.
	 * */
	public static @Ctype("void*") long glfwGetMonitorUserPointer(@Ctype("GLFWmonitor*") long monitor) {
		try {
			return (long)glfwGetMonitorUserPointer.invoke(monitor);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMonitorUserPointer;

	static IMonitorCallback monitorCallbackImpl;
	/**
	 * This function sets the monitor configuration callback, or removes the currently set callback. 
	 * This is called when a monitor is connected to or disconnected from the system.
	 * 
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWmonitor* monitor, int event)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static IMonitorCallback glfwSetMonitorCallback(IMonitorCallback callback) {
		IMonitorCallback tmp = monitorCallbackImpl;
		monitorCallbackImpl = callback;
		return tmp;
	} private static final MethodHandle glfwSetMonitorCallback;	

	/**
	 * This function returns an array of all video modes supported by the specified monitor. 
	 * The returned array is sorted in ascending order, first by color bit depth (the sum of all channel depths), then by resolution area (the product of width and height), then resolution width and finally by refresh rate.
	 * 
	 * @param monitor	The monitor to query.
	 * @param count		Where to store the number of video modes in the returned array. This is set to zero if an error occurred.
	 * 
	 * @return An array of video modes, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. 
	 * It is valid until the specified monitor is disconnected, this function is called again for that monitor or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwGetVideoMode(long)
	 * 
	 * @since Added in version 1.0. GLFW 3: Changed to return an array of modes for a specific monitor.
	 * */
	public static @Ctype("const GLFWvidmode*") long	glfwGetVideoModes(@Ctype("GLFWmonitor*") long monitor, @Ctype("int*") long count){
		try {
			return (long)glfwGetVideoModes.invoke(monitor, count);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetVideoModes;

	/**@see GLFW#glfwGetVideoModes(long, long)*/
	public static @Ctype("const GLFWvidmode*") long	glfwGetVideoModes(@Ctype("GLFWmonitor*") long monitor, IntPointer count){
		return glfwGetVideoModes(monitor, count.address());
	}

	/**
	 * This function returns the current video mode of the specified monitor. 
	 * If you have created a full screen window for that monitor, the return value will depend on whether that window is iconified.
	 * 
	 * @param	monitor	The monitor to query.
	 * 
	 * @return The current mode of the monitor, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. 
	 * It is valid until the specified monitor is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @see GLFW#glfwGetVideoModes(long, long)
	 * 
	 * @since Added in version 3.0. Replaces glfwGetDesktopMode.
	 * */
	public static @Ctype("const GLFWvidmode*") long glfwGetVideoMode(@Ctype("GLFWmonitor*") long monitor){
		try {
			return (long)glfwGetVideoMode.invoke(monitor);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetVideoMode;

	/**
	 * This function generates an appropriately sized gamma ramp from the specified exponent and then calls glfwSetGammaRamp with it. 
	 * The value must be a finite number greater than zero.
	 * The software controlled gamma ramp is applied in addition to the hardware gamma correction, which today is usually an approximation of sRGB gamma. 
	 * This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.
	 * For gamma correct rendering with OpenGL or OpenGL ES, see the {@link GLFW#GLFW_SRGB_CAPABLE} hint.
	 * 
	 * @param monitor	The monitor whose gamma ramp to set.
	 * @param gamma		The desired exponent.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 3.0.
	 * */
	public static void glfwSetGamma(@Ctype("GLFWmonitor*") long monitor, float gamma) {
		try {
			glfwSetGamma.invoke(monitor, gamma);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetGamma;

	/**
	 * This function returns the current gamma ramp of the specified monitor.
	 * 
	 * @param monitor The monitor to query.
	 * 
	 * @return The current gamma ramp, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFW#GLFW_PLATFORM_ERROR} while returning NULL.
	 * 
	 * Object or Pointer lifetime
	 * The returned structure and its arrays are allocated and freed by GLFW. You should not free them yourself. 
	 * They are valid until the specified monitor is disconnected, this function is called again for that monitor or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 */
	public static @Ctype("const GLFWgammaramp*") GLFWGammaRamp glfwGetGammaRamp(@Ctype("GLFWmonitor*") long monitor) {
		try {
			final long address = (long)glfwGetGammaRamp.invoke(monitor);
			GLFWGammaRamp gammaRamp = new GLFWGammaRamp(address);
			return gammaRamp;
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetGammaRamp;

	/**
	 * This function sets the current gamma ramp for the specified monitor. 
	 * The original gamma ramp for that monitor is saved by GLFW the first time this function is called and is restored by glfwTerminate.
	 * The software controlled gamma ramp is applied in addition to the hardware gamma correction, which today is usually an approximation of sRGB gamma. 
	 * This means that setting a perfectly linear ramp, or gamma 1.0, will produce the default (usually sRGB-like) behavior.
	 * For gamma correct rendering with OpenGL or OpenGL ES, see the {@link GLFW#GLFW_SRGB_CAPABLE} hint.
	 * 
	 * @param monitor	The monitor whose gamma ramp to set.
	 * @param ramp		The gamma ramp to use.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * The size of the specified gamma ramp should match the size of the current ramp for that monitor.
	 * Windows: The gamma ramp size must be 256.
	 * Wayland: Gamma handling is a privileged protocol, this function will thus never be implemented and emits {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The specified gamma ramp is copied before this function returns.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * @since Added in version 3.0.
	 * */
	public static void glfwSetGammaRamp(@Ctype("GLFWmonitor*") long monitor, @Ctype("const GLFWgammaramp*") long ramp) {
		try {
			glfwSetGammaRamp.invoke(monitor, ramp);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetGammaRamp;

	/**@see GLFW#glfwSetGammaRamp(long, long)*/
	public static void glfwSetGammaRamp(@Ctype("GLFWmonitor*") long monitor,final GLFWGammaRamp ramp) {
		glfwSetGammaRamp(monitor, ramp.address());
	}

	/**
	 * This function returns the value of an input option for the specified window. 
	 * The mode must be one of {@link GLFW#}GLFW_CURSOR, {@link GLFW#GLFW_STICKY_KEYS}, {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS}, {@link GLFW#GLFW_LOCK_KEY_MODS} or {@link GLFW#GLFW_RAW_MOUSE_MOTION}.
	 * 
	 * @param window	The window to query.
	 * @param mode		One of {@link GLFW#GLFW_CURSOR}, {@link GLFW#GLFW_STICKY_KEYS}, {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS}, {@link GLFW#GLFW_LOCK_KEY_MODS} or {@link GLFW#GLFW_RAW_MOUSE_MOTION}.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwSetInputMode(long, int, int)
	 * @since Added in version 3.0.
	 * */
	public static int glfwGetInputMode(@Ctype("GLFWwindow*") long window, int mode) {
		try {
			return (int)glfwGetInputMode.invoke(window, mode);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetInputMode;

	/**
	 * This function sets an input mode option for the specified window. 
	 * The mode must be one of {@link GLFW#GLFW_CURSOR}, {@link GLFW#GLFW_STICKY_KEYS}, {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS}, {@link GLFW#GLFW_LOCK_KEY_MODS} or {@link GLFW#GLFW_RAW_MOUSE_MOTION}.
	 * If the mode is {@link GLFW#GLFW_CURSOR}, the value must be one of the following cursor modes:
	 * 
	 * {@link GLFW#GLFW_CURSOR_NORMAL} makes the cursor visible and behaving normally.
	 * {@link GLFW#GLFW_CURSOR_HIDDEN} makes the cursor invisible when it is over the content area of the window but does not restrict the cursor from leaving.
	 * {@link GLFW#GLFW_CURSOR_DISABLED} hides and grabs the cursor, providing virtual and unlimited cursor movement. This is useful for implementing for example 3D camera controls.
	 * 
	 * If the mode is {@link GLFW#GLFW_STICKY_KEYS}, the value must be either {@link GLFW#GLFW_TRUE} to enable sticky keys, or {@link GLFW#GLFW_FALSE} to disable it. If sticky keys are enabled, a key press will ensure that glfwGetKey returns {@link GLFW#GLFW_PRESS} the next time it is called even if the key had been released before the call. This is useful when you are only interested in whether keys have been pressed but not when or in which order.
	 * If the mode is {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS}, the value must be either {@link GLFW#GLFW_TRUE} to enable sticky mouse buttons, or {@link GLFW#GLFW_FALSE} to disable it. If sticky mouse buttons are enabled, a mouse button press will ensure that {@link GLFW#glfwGetMouseButton(long, int)} returns {@link GLFW#GLFW_PRESS} the next time it is called even if the mouse button had been released before the call. This is useful when you are only interested in whether mouse buttons have been pressed but not when or in which order.
	 * If the mode is {@link GLFW#GLFW_LOCK_KEY_MODS}, the value must be either {@link GLFW#GLFW_TRUE} to enable lock key modifier bits, or {@link GLFW#GLFW_FALSE} to disable them. If enabled, callbacks that receive modifier bits will also have the {@link GLFW#GLFW_MOD_CAPS_LOCK} bit set when the event was generated with Caps Lock on, and the {@link GLFW#GLFW_MOD_NUM_LOCK} bit when Num Lock was on.
	 * If the mode is {@link GLFW#GLFW_RAW_MOUSE_MOTION}, the value must be either {@link GLFW#GLFW_TRUE} to enable raw (unscaled and unaccelerated) mouse motion when the cursor is disabled, or {@link GLFW#GLFW_FALSE} to disable it. If raw motion is not supported, attempting to set this will emit {@link GLFW#GLFW_PLATFORM_ERROR}. Call glfwRawMouseMotionSupported to check for support.
	 * 
	 * @param window	The window whose input mode to set.
	 * @param mode		One of {@link GLFW#GLFW_CURSOR}, {@link GLFW#GLFW_STICKY_KEYS}, {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS}, {@link GLFW#GLFW_LOCK_KEY_MODS} or {@link GLFW#GLFW_RAW_MOUSE_MOTION}.
	 * @param value		The new value of the specified input mode.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwGetInputMode(long, int)
	 * 
	 * @since Added in version 3.0. Replaces glfwEnable and glfwDisable.
	 * */
	public static void glfwSetInputMode(@Ctype("GLFWwindow*") long window, int mode, int value) {
		try {
			glfwSetInputMode.invoke(window, mode, value);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetInputMode;

	/**
	 * This function returns whether raw mouse motion is supported on the current system. 
	 * This status does not change after GLFW has been initialized so you only need to check this once. 
	 * If you attempt to enable raw motion on a system that does not support it, {@link GLFW#GLFW_PLATFORM_ERROR} will be emitted.
	 * Raw mouse motion is closer to the actual motion of the mouse across a surface. 
	 * It is not affected by the scaling and acceleration applied to the motion of the desktop cursor. 
	 * That processing is suitable for a cursor while raw motion is better for controlling for example a 3D camera. 
	 * Because of this, raw mouse motion is only provided when the cursor is disabled.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if raw mouse motion is supported on the current machine, or {@link GLFW#GLFW_FALSE} otherwise.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwSetInputMode(long, int, int)
	 * 
	 * @since Added in version 3.3.
	 */
	public static int glfwRawMouseMotionSupported() {
		try {
			return (int)glfwRawMouseMotionSupported.invoke();
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwRawMouseMotionSupported;

	/**
	 * This function returns the name of the specified printable key, encoded as UTF-8.
	 * This is typically the character that key would produce without any modifier keys, intended for displaying key bindings to the user. 
	 * For dead keys, it is typically the diacritic it would add to a character.
	 * Do not use this function for text input. You will break text input for many languages even if it happens to work for yours.
	 * If the key is {@link GLFW#GLFW_KEY_UNKNOWN}, the scancode is used to identify the key, otherwise the scancode is ignored. 
	 * If you specify a non-printable key, or {@link GLFW#GLFW_KEY_UNKNOWN} and a scancode that maps to a non-printable key, this function returns NULL but does not emit an error.
	 * This behavior allows you to always pass in the arguments in the key callback without modification.
	 * <p>
	 * The printable keys are:
	 * {@link GLFW#GLFW_KEY_APOSTROPHE}
	 * {@link GLFW#GLFW_KEY_COMMA}
	 * {@link GLFW#GLFW_KEY_MINUS}
	 * {@link GLFW#GLFW_KEY_PERIOD}
	 * {@link GLFW#GLFW_KEY_SLASH}
	 * {@link GLFW#GLFW_KEY_SEMICOLON}
	 * {@link GLFW#GLFW_KEY_EQUAL}
	 * {@link GLFW#GLFW_KEY_LEFT_BRACKET}
	 * {@link GLFW#GLFW_KEY_RIGHT_BRACKET}
	 * {@link GLFW#GLFW_KEY_BACKSLASH}
	 * {@link GLFW#GLFW_KEY_WORLD_1}
	 * {@link GLFW#GLFW_KEY_WORLD_2}
	 * {@link GLFW#GLFW_KEY_0} to {@link GLFW#GLFW_KEY_9}
	 * {@link GLFW#GLFW_KEY_A} to {@link GLFW#GLFW_KEY_Z}
	 * {@link GLFW#GLFW_KEY_KP}_0 to {@link GLFW#GLFW_KEY_KP_9}
	 * {@link GLFW#GLFW_KEY_KP_DECIMAL}
	 * {@link GLFW#GLFW_KEY_KP_DIVIDE}
	 * {@link GLFW#GLFW_KEY_KP_MULTIPLY}
	 * {@link GLFW#GLFW_KEY_KP_SUBTRACT}
	 * {@link GLFW#GLFW_KEY_KP_SUBTRACT}
	 * {@link GLFW#GLFW_KEY_KP_EQUAL}
	 * <p>
	 * Names for printable keys depend on keyboard layout, while names for non-printable keys are the same across layouts but depend on the application language and should be localized along with other user interface text.
	 * 
	 * Parameters
	 * @param key		The key to query, or {@link GLFW#GLFW_KEY_UNKNOWN}.
	 * @param scancode	The scancode of the key to query.
	 * 
	 * @return The UTF-8 encoded, layout-specific name of the key, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * The contents of the returned string may change when a keyboard layout change event is received.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static @Ctype("const char*") long glfwGetKeyName(int key, int scancode) {
		try {
			return (long)glfwGetKeyName.invoke(key, scancode);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetKeyName;

	/**@see GLFW#glfwGetKeyName(int, int)*/
	public static String glfwGetKeyNameUTF8(int key, int scancode) {
		@Ctype("const char*")
		final long chars = glfwGetKeyName(key, scancode);
		return BytePointer.asAddress(chars).toUTF8();
	}

	/**
	 * This function returns the platform-specific scancode of the specified key.
	 * If the specified key token corresponds to a physical key not supported on the current platform then this method will return -1. 
	 * Calling this function with anything other than a key token will return -1 and generate a {@link GLFW#GLFW_INVALID_ENUM} error.
	 * 
	 * @param key Any key token.
	 * 
	 * @return The platform-specific scancode for the key, or -1 if the key is not supported on the current platform or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static int glfwGetKeyScancode(int key) {
		try {
			return (int)glfwGetKeyScancode.invoke(key);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetKeyScancode;

	/**
	 * This function returns the last state reported for the specified key to the specified window. 
	 * The returned state is one of {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}. 
	 * The action {@link GLFW#GLFW_REPEAT} is only reported to the key callback.
	 * If the {@link GLFW#GLFW_STICKY_KEYS} input mode is enabled, this function returns {@link GLFW#GLFW_PRESS} the first time you call it for a key that was pressed, even if that key has already been released.
	 * The key functions deal with physical keys, with key tokens named after their use on the standard US keyboard layout. 
	 * If you want to input text, use the Unicode character callback instead.
	 * The modifier key bit masks are not key tokens and cannot be used with this function.
	 * 
	 * Do not use this function to implement text input.
	 * 
	 * @param window	The desired window.
	 * @param key		The desired keyboard key. {@link GLFW#GLFW_KEY_UNKNOWN} is not a valid key for this function.
	 * 
	 * @return One of {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static int glfwGetKey(@Ctype("GLFWwindow*") long window, int key) {
		try {
			return (int)glfwGetKey.invoke(window, key);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetKey;

	/**
	 * This function returns the last state reported for the specified mouse button to the specified window. 
	 * The returned state is one of {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
	 * If the {@link GLFW#GLFW_STICKY_MOUSE_BUTTONS} input mode is enabled, this function returns GLFW_PRESS the first time you call it for a mouse button that was pressed, even if that mouse button has already been released.
	 * 
	 * @param window	The desired window.
	 * @param button	The desired mouse button.
	 * 
	 * @return One of {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter.
	 * */
	public static int glfwGetMouseButton(@Ctype("GLFWwindow*") long window, int button) {
		try {
			return (int)glfwGetMouseButton.invoke(window, button);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetMouseButton;

	/**
	 * This function returns the position of the cursor, in screen coordinates, relative to the upper-left corner of the content area of the specified window.
	 * If the cursor is disabled (with {@link GLFW#GLFW_CURSOR_DISABLED}) then the cursor position is unbounded and limited only by the minimum and maximum values of a double.
	 * The coordinate can be converted to their integer equivalents with the floor function. Casting directly to an integer type works for positive coordinates, but fails for negative ones.
	 * Any or all of the position arguments may be NULL. 
	 * If an error occurs, all non-NULL position arguments will be set to zero.
	 * 
	 * @param window	The desired window.
	 * @param xpos		Where to store the cursor x-coordinate, relative to the left edge of the content area, or NULL.
	 * @param ypos		Where to store the cursor y-coordinate, relative to the to top edge of the content area, or NULL.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see glfwSetCursorPos(long, double, double)
	 * 
	 * @since Added in version 3.0. Replaces glfwGetMousePos.
	 * */
	public static void glfwGetCursorPos(@Ctype("GLFWwindow*") long window, @Ctype("double*") long xpos, @Ctype("double*") long ypos) {
		try {
			glfwGetCursorPos.invoke(window, xpos, ypos);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwGetCursorPos;

	/**@see GLFW#glfwGetCursorPos(long, long, long)*/
	public static void glfwGetCursorPos(@Ctype("GLFWwindow*") long window, DoublePointer xpos, DoublePointer ypos) {
		glfwGetCursorPos(window, xpos.address(), ypos.address());
	}

	/**
	 * This function sets the position, in screen coordinates, of the cursor relative to the upper-left corner of the content area of the specified window. The window must have input focus. 
	 * If the window does not have input focus when this function is called, it fails silently.
	 * Do not use this function to implement things like camera controls. GLFW already provides the {@link GLFW#GLFW_CURSOR_DISABLED} cursor mode that hides the cursor, transparently re-centers it and provides unconstrained cursor motion. 
	 * See {@link GLFW#glfwSetInputMode(long, int, int)}} for more information.
	 * If the cursor mode is {@link GLFW#GLFW_CURSOR_DISABLED} then the cursor position is unconstrained and limited only by the minimum and maximum values of a double.
	 * 
	 * @param window	The desired window.
	 * @param xpos		The desired x-coordinate, relative to the left edge of the content area.
	 * @param ypos		The desired y-coordinate, relative to the top edge of the content area.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Remarks
	 * Wayland: This function will only work when the cursor mode is {@link GLFW#GLFW_CURSOR_DISABLED}, otherwise it will do nothing.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwGetCursorPos(long, long, long)
	 * 
	 * @since Added in version 3.0. Replaces glfwSetMousePos.
	 * */
	public static void glfwSetCursorPos(@Ctype("GLFWwindow*") long window, double xpos, double ypos) {
		try {
			glfwSetCursorPos.invoke(window, xpos, ypos);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetCursorPos;

	/**
	 * Creates a new custom cursor image that can be set for a window with {@link GLFW#glfwSetCursor(long, long)}. 
	 * The cursor can be destroyed with glfwDestroyCursor. Any remaining cursors are destroyed by {@link GLFW#glfwTerminate()}.
	 * The pixels are 32-bit, little-endian, non-premultiplied RGBA, i.e. eight bits per channel with the red channel first. 
	 * They are arranged canonically as packed sequential rows, starting from the top-left corner.
	 * The cursor hotspot is specified in pixels, relative to the upper-left corner of the cursor image. 
	 * Like all other coordinate systems in GLFW, the X-axis points to the right and the Y-axis points down.
	 * 
	 * @param image	The desired cursor image.
	 * @param xhot	The desired x-coordinate, in pixels, of the cursor hotspot.
	 * @param yhot	The desired y-coordinate, in pixels, of the cursor hotspot.
	 * 
	 * @return The handle of the created cursor, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_VALUE} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The specified image data is copied before this function returns.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwDestroyCursor(long), GLFW#glfwCreateStandardCursor(int)
	 * 
	 * @since Added in version 3.1.
	 * */
	public static @Ctype("GLFWcursor*") long glfwCreateCursor(final GLFWimage image, int xhot, int yhot) {
		try {
			return (long)glfwCreateCursor.invoke(image.address(), xhot, yhot);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwCreateCursor;

	/**
	 * Returns a cursor with a standard shape, that can be set for a window with {@link GLFW#glfwSetCursor(long, long)}.
	 * 
	 * @param shape	One of the standard shapes.
	 * 
	 * @return A new cursor ready to use or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwCreateCursor(GLFWimage, int, int)
	 * 
	 * @since Added in version 3.1.
	 * */
	public static @Ctype("GLFWcursor*") long glfwCreateStandardCursor(int shape) {
		try {
			return (long)glfwCreateStandardCursor.invoke(shape);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwCreateStandardCursor;

	/**
	 * This function destroys a cursor previously created with {@link GLFW#glfwCreateCursor(GLFWimage, int, int)}. 
	 * Any remaining cursors will be destroyed by {@link GLFW#glfwTerminate()}.
	 * If the specified cursor is current for any window, that window will be reverted to the default cursor. 
	 * This does not affect the cursor mode.
	 * 
	 * @param cursor The cursor object to destroy.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Reentrancy
	 * This function must not be called from a callback.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwCreateCursor(GLFWimage, int, int)
	 * 
	 * @since Added in version 3.1.
	 * */
	public static void glfwDestroyCursor(@Ctype("GLFWcursor*") long cursor) {
		try {
			glfwDestroyCursor.invoke(cursor);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwDestroyCursor;

	/**
	 * This function sets the cursor image to be used when the cursor is over the content area of the specified window. 
	 * The set cursor will only be visible when the cursor mode of the window is {@link GLFW#GLFW_CURSOR_NORMAL}.
	 * On some platforms, the set cursor may not be visible unless the window also has input focus.
	 * 
	 * @param window	The window to set the cursor for.
	 * @param cursor	The cursor to set, or NULL to switch back to the default arrow cursor.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.1.
	 * */
	public static void glfwSetCursor(@Ctype("GLFWwindow*") long window, @Ctype("GLFWcursor*") long cursor) {
		try {
			glfwSetCursor.invoke(window, cursor);
		} catch (Throwable e) {throw new RuntimeException(e);}
	} private static final MethodHandle glfwSetCursor;

	/**
	 * This function sets the key callback of the specified window, which is called when a key is pressed, repeated or released.
	 * The key functions deal with physical keys, with layout independent key tokens named after their values in the standard US keyboard layout. 
	 * If you want to input text, use the character callback instead.
	 * When a window loses input focus, it will generate synthetic key release events for all pressed keys with associated key tokens. 
	 * You can tell these events from user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been called.
	 * The scancode of a key is specific to that platform or sometimes even to that machine. 
	 * Scancodes are intended to allow users to bind keys that don't have a GLFW key token. Such keys have key set to {@link GLFW#GLFW_KEY_UNKNOWN}, their state is not saved and so it cannot be queried with glfwGetKey.
	 * Sometimes GLFW needs to generate synthetic key events, in which case the scancode may be zero.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new key callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int key, int scancode, int action, int mods)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter and return value.
	 * */
	public static IKeyCallback glfwSetKeyCallback(@Ctype("GLFWwindow*") long window, IKeyCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setKeyCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetKeyCallback;

	/**
	 * This function sets the character callback of the specified window, which is called when a Unicode character is input.
	 * The character callback is intended for Unicode text input. 
	 * As it deals with characters, it is keyboard layout dependent, whereas the key callback is not. 
	 * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. 
	 * If you want to know whether a specific physical key was pressed or released, see the key callback instead.
	 * The character callback behaves as system text input normally does and will not be called if modifier keys are held down that would prevent normal text input on that platform, for example a Super (Command) key on macOS or Alt key on Windows.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, unsigned int codepoint)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 2.4. GLFW 3: Added window handle parameter and return value.
	 * */
	public static ICharCallback glfwSetCharCallback(@Ctype("GLFWwindow*") long window, ICharCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setCharCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetCharCallback;

	/**
	 * This function sets the character with modifiers callback of the specified window, which is called when a Unicode character is input regardless of what modifier keys are used.
	 * The character with modifiers callback is intended for implementing custom Unicode character input. 
	 * For regular Unicode text input, see the character callback. Like the character callback, the character with modifiers callback deals with characters and is keyboard layout dependent. 
	 * Characters do not map 1:1 to physical keys, as a key may produce zero, one or more characters. 
	 * If you want to know whether a specific physical key was pressed or released, see the key callback instead.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or an error occurred.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, unsigned int codepoint, int mods)
	 * 
	 * @deprecated Scheduled for removal in version 4.0.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.1.
	 * */
	@Deprecated(forRemoval = true) public static ICharModsCallback glfwSetCharModsCallback(@Ctype("GLFWwindow*") long window, ICharModsCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setCharModsCallback(callback);
			}
		}
		return null;
	} @Deprecated(forRemoval = true) private static final MethodHandle glfwSetCharModsCallback;

	/**
	 * This function sets the mouse button callback of the specified window, which is called when a mouse button is pressed or released.
	 * When a window loses input focus, it will generate synthetic mouse button release events for all pressed mouse buttons. 
	 * You can tell these events from user-generated events by the fact that the synthetic ones are generated after the focus loss event has been processed, i.e. after the window focus callback has been called.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return
	 * The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int button, int action, int mods)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 1.0. GLFW 3: Added window handle parameter and return value.
	 * */
	public static IMouseButtonCallback glfwSetMouseButtonCallback(@Ctype("GLFWwindow*") long window, IMouseButtonCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setMouseButtonCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetMouseButtonCallback;

	/**
	 * This function sets the cursor position callback of the specified window, which is called when the cursor is moved. 
	 * The callback is provided with the position, in screen coordinates, relative to the upper-left corner of the content area of the window.
	 * 
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 *
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, double xpos, double ypos);
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. Replaces glfwSetMousePosCallback.
	 * */
	public static ICursorPosCallback glfwSetCursorPosCallback(@Ctype("GLFWwindow*") long window, ICursorPosCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setCursorPosCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetCursorPosCallback;

	/**
	 * This function sets the cursor boundary crossing callback of the specified window, which is called when the cursor enters or leaves the content area of the window.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int entered)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static ICursorEnterCallback glfwSetCursorEnterCallback(@Ctype("GLFWwindow*") long window, ICursorEnterCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setCursorEnterCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetCursorEnterCallback;

	/**
	 * This function sets the scroll callback of the specified window, which is called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.
	 * The scroll callback receives all scrolling input, like that from a mouse wheel or a touchpad scrolling area.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new scroll callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, double xoffset, double yoffset)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. Replaces glfwSetMouseWheelCallback.
	 * */
	public static IScrollCallback glfwSetScrollCallback(@Ctype("GLFWwindow*") long window, IScrollCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setScrollCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetScrollCallback;

	/**
	 * This function sets the path drop callback of the specified window, which is called when one or more dragged paths are dropped on the window.
	 * Because the path array and its strings may have been generated specifically for that event, they are not guaranteed to be valid after the callback has returned. If you wish to use them after the callback returns, you need to make a deep copy.
	 * 
	 * @param window	The window whose callback to set.
	 * @param callback	The new file drop callback, or NULL to remove the currently set callback.
	 * 
	 * @return
	 * The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(GLFWwindow* window, int path_count, const char* paths[])
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Remarks
	 * Wayland: File drop is currently unimplemented.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.1. 
	 * */
	public static IDropCallback glfwSetDropCallback(@Ctype("GLFWwindow*") long window, IDropCallback callback) {
		for (GLJWLinkedList.Node<GLFWwindow> node = WINDOWS_OBJECTS.first(); node != null; node = node.getNext()) {
			if (node.getValue().pointer() == window) {
				return node.getValue().setDropCallback(callback);
			}
		}
		return null;
	} private static final MethodHandle glfwSetDropCallback;

	/**
	 * This function returns whether the specified joystick is present.
	 * There is no need to call this function before other functions that accept a joystick ID, as they all check for presence before performing any other work.
	 * 
	 * @param jid The joystick to query.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if the joystick is present, or {@link GLFW#GLFW_FALSE} otherwise.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. Replaces glfwGetJoystickParam.
	 * */
	public static int glfwJoystickPresent(int jid) {
		try {
			return (int)glfwJoystickPresent.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwJoystickPresent;

	/**
	 * This function returns the values of all axes of the specified joystick. 
	 * Each element in the array is a value between -1.0 and 1.0.
	 * If the specified joystick is not present this function will return NULL but will not generate an error. This can be used instead of first calling {@link GLFW#glfwJoystickPresent(int)}.
	 * 
	 * @param jid		The joystick to query.
	 * @param count		Where to store the number of axis values in the returned array. This is set to zero if the joystick is not present or an error occurred.
	 * 
	 * @return An array of axis values, or NULL if the joystick is not present or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0. Replaces glfwGetJoystickPos.
	 * */
	public static @Ctype("const float*") long glfwGetJoystickAxes(int jid, @Ctype("int*") long count) {
		try {
			return (long)glfwGetJoystickAxes.invoke(jid, count);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickAxes;

	/**@see GLFW#glfwGetJoystickButtons(int, long)*/
	public static FloatPointer glfwGetJoystickAxes(int jid, IntPointer count) {
		return FloatPointer.asAddress(glfwGetJoystickAxes(jid, count.address()));
	}

	/**
	 * This function returns the state of all buttons of the specified joystick. 
	 * Each element in the array is either {@link GLFW#GLFW_PRESS} or {@link GLFW#GLFW_RELEASE}.
	 * For backward compatibility with earlier versions that did not have {@link GLFW#glfwGetJoystickHats(int, long)}, the button array also includes all hats, each represented as four buttons. 
	 * The hats are in the same order as returned by glfwGetJoystickHats and are in the order up, right, down and left. 
	 * To disable these extra buttons, set the {@link GLFW#}GLFW_JOYSTICK_HAT_BUTTONS init hint before initialization.
	 * If the specified joystick is not present this function will return NULL but will not generate an error. 
	 * This can be used instead of first calling {@link GLFW#glfwJoystickPresent(int)}.
	 * 
	 * @param jid	The joystick to query.
	 * @param count	Where to store the number of button states in the returned array. This is set to zero if the joystick is not present or an error occurred.
	 * 
	 * @return An array of button states, or NULL if the joystick is not present or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 2.2. GLFW 3: Changed to return a dynamic array.
	 * */
	public static @Ctype("const unsigned char*") long glfwGetJoystickButtons(int jid, @Ctype("int*") long count){
		try {
			return (long)glfwGetJoystickButtons.invoke(jid, count);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickButtons;	

	/**@see GLFW#glfwGetJoystickButtons(int, long)*/
	public static @Ctype("const unsigned char*") BytePointer glfwGetJoystickButtons(int jid, IntPointer count){
		return BytePointer.asAddress(glfwGetJoystickButtons(jid, count.address()));
	}

	/**
	 * This function returns the state of all hats of the specified joystick. Each element in the array is one of the following values:
	 * Name						Value
	 * {@link GLFW#GLFW_HAT_CENTERED}		0
	 * {@link GLFW#GLFW_HAT_UP}				1
	 * {@link GLFW#GLFW_HAT_RIGHT}			2
	 * {@link GLFW#GLFW_HAT_DOWN}			4
	 * {@link GLFW#GLFW_HAT_LEFT}			8
	 * {@link GLFW#GLFW_HAT_RIGHT_UP}		{@link GLFW#GLFW_HAT_RIGHT} | {@link GLFW#GLFW_HAT_UP}
	 * {@link GLFW#GLFW_HAT_RIGHT_DOWN}		{@link GLFW#GLFW_HAT_RIGHT} | {@link GLFW#GLFW_HAT_DOWN}
	 * {@link GLFW#GLFW_HAT_LEFT_UP}		{@link GLFW#GLFW_HAT_LEFT} 	| {@link GLFW#GLFW_HAT_UP}
	 * {@link GLFW#GLFW_HAT_LEFT_DOWN}		{@link GLFW#GLFW_HAT_LEFT} 	| {@link GLFW#GLFW_HAT_DOWN}
	 * The diagonal directions are bitwise combinations of the primary (up, right, down and left) directions and you can test for these individually by ANDing it with the corresponding direction.
	 * 
	 * if (hats[2] & GLFW_HAT_RIGHT){
	 * 	// State of hat 2 could be right-up, right or right-down
	 * }
	 * If the specified joystick is not present this function will return NULL but will not generate an error. This can be used instead of first calling {@link GLFW#glfwJoystickPresent(int)}.
	 * 
	 * @param jid	The joystick to query.
	 * @param count	Where to store the number of hat states in the returned array. This is set to zero if the joystick is not present or an error occurred.
	 * 
	 * @return An array of hat states, or NULL if the joystick is not present or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned array is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected, this function is called again for that joystick or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static @Ctype("const unsigned char*") long glfwGetJoystickHats(int jid, @Ctype("int*") long count) {
		try {
			return (long)glfwGetJoystickHats.invoke(jid, count);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickHats;

	/**@see GLFW#glfwGetJoystickHats(int, long)*/
	public static @Ctype("const unsigned char*") BytePointer glfwGetJoystickHats(int jid, IntPointer count) {
		return BytePointer.asAddress(glfwGetJoystickHats(jid, count.address()));
	}

	/**
	 * This function returns the name, encoded as UTF-8, of the specified joystick. 
	 * The returned string is allocated and freed by GLFW. You should not free it yourself.
	 * If the specified joystick is not present this function will return NULL but will not generate an error. 
	 * This can be used instead of first calling g{@link GLFW#glfwJoystickPresent(int)}.
	 * 
	 * @param jid The joystick to query.
	 * 
	 * @return The UTF-8 encoded name of the joystick, or NULL if the joystick is not present or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("const char*") long glfwGetJoystickName(int jid) {
		try {
			return (long)glfwGetJoystickName.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickName;

	/**@see GLFW#glfwGetJoystickName(int)*/
	public static String glfwGetJoystickNameUTF8(int jid) {
		return BytePointer.asAddress(glfwGetJoystickName(jid)).toUTF8();
	}

	/**
	 * This function returns the SDL compatible GUID, as a UTF-8 encoded hexadecimal string, of the specified joystick. 
	 * The returned string is allocated and freed by GLFW. You should not free it yourself.
	 * The GUID is what connects a joystick to a gamepad mapping. A connected joystick will always have a GUID even if there is no gamepad mapping assigned to it.
	 * If the specified joystick is not present this function will return NULL but will not generate an error. This can be used instead of first calling {@link GLFW#glfwJoystickPresent(int)}.
	 * The GUID uses the format introduced in SDL 2.0.5. This GUID tries to uniquely identify the make and model of a joystick but does not identify a specific unit, e.g. all wired Xbox 360 controllers will have the same GUID on that platform. 
	 * The GUID for a unit may vary between platforms depending on what hardware information the platform specific APIs provide.
	 *
	 * @param jid	The joystick to query.
	 * 
	 * @return The UTF-8 encoded GUID of the joystick, or NULL if the joystick is not present or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#GLFW_INVALID_ENUM} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the specified joystick is disconnected or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.3.
	 * */
	public static @Ctype("const char*") long glfwGetJoystickGUID(int jid) {
		try {
			return (long)glfwGetJoystickGUID.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickGUID;

	/**
	 * This function sets the user-defined pointer of the specified joystick. 
	 * The current value is retained until the joystick is disconnected. 
	 * The initial value is NULL.
	 * This function may be called from the joystick callback, even for a joystick that is being disconnected.
	 * 
	 * @param jid		The joystick whose pointer to set.
	 * @param pointer	The new value.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @see GLFW#glfwGetJoystickUserPointer(int)
	 * 
	 * @since Added in version 3.3.
	 * */
	public static void glfwSetJoystickUserPointer(int jid, @Ctype("void*") long pointer) {
		try {
			glfwSetJoystickUserPointer.invoke(jid, pointer);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwSetJoystickUserPointer;

	/**@see GLFW#glfwSetJoystickUserPointer(int, long)*/
	public static void glfwSetJoystickUserPointer(int jid, VoidPointer pointer) {
		glfwSetJoystickUserPointer(jid, pointer.address()); 
	}

	/**
	 * This function returns the current value of the user-defined pointer of the specified joystick. 
	 * The initial value is NULL.
	 * This function may be called from the joystick callback, even for a joystick that is being disconnected.
	 * 
	 * @param jid	The joystick whose pointer to return.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Access is not synchronized.
	 * 
	 * @see GLFW#glfwSetJoystickUserPointer(int, long)
	 * 
	 * @since Added in version 3.3.
	 * */
	public static @Ctype("void*") long glfwGetJoystickUserPointer (int jid) {
		try {
			return (long)glfwGetJoystickUserPointer.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetJoystickUserPointer;

	/**
	 * This function returns whether the specified joystick is both present and has a gamepad mapping.
	 * If the specified joystick is present but does not have a gamepad mapping this function will return {@link GLFW#GLFW_FALSE} but will not generate an error. 
	 * Call {@link GLFW#glfwJoystickPresent(int)} to check if a joystick is present regardless of whether it has a mapping.
	 * 
	 * @param jid The joystick to query.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if a joystick is both present and has a gamepad mapping, or {@link GLFW#GLFW_FALSE} otherwise.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwGetGamepadState(int, GLFWGamepadState)
	 * 
	 * @since Added in version 3.3.
	 * */
	public static int glfwJoystickIsGamepad(int jid) {
		try {
			return (int)glfwJoystickIsGamepad.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwJoystickIsGamepad;

	/**@see GLFW#glfwSetJoystickCallback(IJoystickCallback)*/
	static IJoystickCallback joystickCallbackImpl;
	/**
	 * This function sets the joystick configuration callback, or removes the currently set callback. 
	 * This is called when a joystick is connected to or disconnected from the system.
	 * For joystick connection and disconnection events to be delivered on all platforms, you need to call one of the event processing functions. 
	 * Joystick disconnection may also be detected and the callback called by joystick functions. 
	 * The function will then return whatever it returns if the joystick is not present.
	 * 
	 * @param callback	The new callback, or NULL to remove the currently set callback.
	 * 
	 * @return The previously set callback, or NULL if no callback was set or the library had not been initialized.
	 * 
	 * Callback signature
	 * void function_name(int jid, int event)
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @since Added in version 3.2.
	 * */
	public static IJoystickCallback glfwSetJoystickCallback(IJoystickCallback callback) {
		IJoystickCallback tmp = joystickCallbackImpl;
		joystickCallbackImpl = callback;
		return tmp;
	} private static final MethodHandle glfwSetJoystickCallback;		

	/**
	 * This function parses the specified ASCII encoded string and updates the internal list with any gamepad mappings it finds. 
	 * This string may contain either a single gamepad mapping or many mappings separated by newlines. 
	 * The parser supports the full format of the gamecontrollerdb.txt source file including empty lines and comments.
	 * See Gamepad mappings for a description of the format.
	 * If there is already a gamepad mapping for a given GUID in the internal list, it will be replaced by the one passed to this function. 
	 * If the library is terminated and re-initialized the internal list will revert to the built-in default.
	 * 
	 * @param string	The string containing the gamepad mappings.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if successful, or {@link GLFW#GLFW_FALSE} if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_VALUE}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwJoystickIsGamepad(int)}, {@link GLFW#glfwGetGamepadName(int)} 
	 * 
	 * @since Added in version 3.3.
	 * */
	public static int glfwUpdateGamepadMappings(@Ctype("const char*") long string) {
		try {
			return (int)glfwUpdateGamepadMappings.invoke(string);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwUpdateGamepadMappings;

	/**
	 * This function returns the human-readable name of the gamepad from the gamepad mapping assigned to the specified joystick.
	 * If the specified joystick is not present or does not have a gamepad mapping this function will return NULL but will not generate an error. 
	 * Call glfwJoystickPresent to check whether it is present regardless of whether it has a mapping.
	 * 
	 * @param jid The joystick to query.
	 * 
	 * @return The UTF-8 encoded name of the gamepad, or NULL if the joystick is not present, does not have a mapping or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. 
	 * It is valid until the specified joystick is disconnected, the gamepad mappings are updated or the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwJoystickIsGamepad(int)
	 * 
	 * @see Added in version 3.3.
	 * */
	public static @Ctype("const char*") long glfwGetGamepadName(int jid) {
		try {
			return (long)glfwGetGamepadName.invoke(jid);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetGamepadName;

	/**@see GLFW#glfwGetGamepadName(int)*/
	public static String glfwGetGamepadNameUTF8(int jid) {
		return BytePointer.asAddress(glfwGetGamepadName(jid)).toUTF8();
	}

	/**
	 * This function retrieves the state of the specified joystick remapped to an Xbox-like gamepad.
	 * If the specified joystick is not present or does not have a gamepad mapping this function will return {@link GLFW#}GLFW_FALSE but will not generate an error. 
	 * Call {@link GLFW#glfwJoystickPresent(int)} to check whether it is present regardless of whether it has a mapping.
	 * The Guide button may not be available for input as it is often hooked by the system or the Steam client.
	 * Not all devices have all the buttons or axes provided by {@link GLFWGamepadState}. Unavailable buttons and axes will always report {@link GLFW#GLFW_RELEASE} and 0.0 respectively.
	 * 
	 * @param jid	The joystick to query.
	 * @param state	The gamepad input state of the joystick.
	 * 
	 * @return {@link GLFW#GLFW_TRUE} if successful, or {@link GLFW#GLFW_FALSE} if no joystick is connected, it has no gamepad mapping or an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_ENUM}.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see {@link GLFW#glfwUpdateGamepadMappings(long)}, {@link GLFW#glfwJoystickIsGamepad(int)} 
	 * 
	 * @since Added in version 3.3.
	 * */
	public static int glfwGetGamepadState(int jid, GLFWGamepadState state) {
		try {
			return (int)glfwGetGamepadState.invoke(jid, state.address());
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetGamepadState;

	/**
	 * 
	 * This function sets the system clipboard to the specified, UTF-8 encoded string.
	 * 
	 * @param window	Deprecated. Any valid window or NULL.
	 * @param string	A UTF-8 encoded string.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The specified string is copied before this function returns.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * 
	 * @see GLFW#glfwGetClipboardString(long)
	 * 
	 * Since
	 * Added in version 3.0.
	 * */
	public static void glfwSetClipboardString(@Nullable @Deprecated @Ctype("GLFWwindow*") long window, @Ctype("const char*") long string) {
		try {
			glfwSetClipboardString.invoke(window, string);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwSetClipboardString;

	/**@see GLFW#glfwSetClipboardString(long, long)*/
	public static void glfwSetClipboardString(@Nullable @Deprecated @Ctype("GLFWwindow*") long window, CharSequence string) {
		try(BytePointer str = BytePointer.allocUTF8(string)){
			glfwSetClipboardString(window, str.address());
		}
	}

	/**
	 * This function returns the contents of the system clipboard, if it contains or is convertible to a UTF-8 encoded string. 
	 * If the clipboard is empty or if its contents cannot be converted, NULL is returned and a {@link GLFW#GLFW_FORMAT_UNAVAILABLE} error is generated.
	 * 
	 * @param window	Deprecated. Any valid window or NULL.
	 * 
	 * @return The contents of the clipboard as a UTF-8 encoded string, or NULL if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}, {@link GLFW#}GLFW_FORMAT_UNAVAILABLE and {@link GLFW#GLFW_PLATFORM_ERROR}.
	 * 
	 * Pointer lifetime
	 * The returned string is allocated and freed by GLFW. You should not free it yourself. 
	 * It is valid until the next call to {@link GLFW#glfwGetClipboardString(long)} or {@link GLFW#glfwSetClipboardString(long, CharSequence)} or until the library is terminated.
	 * 
	 * Thread safety
	 * This function must only be called from the main thread.
	 * 
	 * @see GLFW#glfwSetClipboardString(long, CharSequence)
	 * 
	 * @since Added in version 3.0.
	 * */
	public static @Ctype("const char*") long glfwGetClipboardString(@Ctype("GLFWwindow*") long window) {
		try {
			return (long)glfwGetClipboardString.invoke(window);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetClipboardString;
	
	/**@see GLFW#glfwGetClipboardString(long)*/
	public static String glfwGetClipboardStringUTF8(@Ctype("GLFWwindow*") long window) {
		return BytePointer.asAddress(glfwGetClipboardString(window)).toUTF8();
	}

	/**
	 * This function returns the current GLFW time, in seconds. 
	 * Unless the time has been set using glfwSetTime it measures time elapsed since GLFW was initialized.
	 * This function and glfwSetTime are helper functions on top of glfwGetTimerFrequency and glfwGetTimerValue.
	 * The resolution of the timer is system dependent, but is usually on the order of a few micro- or nanoseconds. 
	 * It uses the highest-resolution monotonic time source on each supported platform.
	 * 
	 * @return The current time, in seconds, or zero if an error occurred.
	 * 
	 * Errors
	 * Possible errors include GLFW_NOT_INITIALIZED.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Reading and writing of the internal base time is not atomic, so it needs to be externally synchronized with calls to glfwSetTime.
	 * 
	 * @since Added in version 1.0.
	 * */
	public static double glfwGetTime() {
		try {
			return (double)glfwGetTime.invoke();
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetTime;

	/**
	 * This function sets the current GLFW time, in seconds. 
	 * The value must be a positive finite number less than or equal to 18446744073.0, which is approximately 584.5 years.
	 * This function and {@link GLFW#glfwGetTime()} are helper functions on top of {@link GLFW#glfwGetTimerFrequency()} and {@link GLFW#glfwGetTimerValue()}.
	 * 
	 * @param time	The new value, in seconds.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED} and {@link GLFW#GLFW_INVALID_VALUE}.
	 * 
	 * Remarks
	 * The upper limit of GLFW time is calculated as floor((264 - 1) / 109) and is due to implementations storing nanoseconds in 64 bits. The limit may be increased in the future.
	 * 
	 * Thread safety
	 * This function may be called from any thread. Reading and writing of the internal base time is not atomic, so it needs to be externally synchronized with calls to {@link GLFW#glfwGetTime()}.
	 * 
	 * @since Added in version 2.2.
	 * */
	public static void glfwSetTime(double time) {
		try {
			glfwSetTime.invoke(time);
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwSetTime;

	/**
	 * This function returns the current value of the raw timer, measured in 1 / frequency seconds. 
	 * To get the frequency, call glfwGetTimerFrequency.
	 * 
	 * @return The value of the timer, or zero if an error occurred.
	 * 
	 * Errors
	 * Possible errors include GLFW_NOT_INITIALIZED.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see GLFW#glfwGetTimerFrequency()
	 * 
	 * @since Added in version 3.2.
	 * */
	public static @Ctype("uint64_t") long glfwGetTimerValue() {
		try {
			return (long)glfwGetTimerValue.invoke();
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetTimerValue;
	
	/**
	 * This function returns the frequency, in Hz, of the raw timer.
	 * 
	 * @return The frequency of the timer, in Hz, or zero if an error occurred.
	 * 
	 * Errors
	 * Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED}.
	 * 
	 * Thread safety
	 * This function may be called from any thread.
	 * 
	 * @see GLFW#glfwGetTimerValue()
	 * 
	 * @since Added in version 3.2.
	 * */
	public static @Ctype("uint64_t") long glfwGetTimerFrequency() {
		try {
			return (long)glfwGetTimerFrequency.invoke();
		}catch(Throwable t) {throw new RuntimeException(t);}
	} private static final MethodHandle glfwGetTimerFrequency;

	static {
		WINDOWS_OBJECTS = new GLJWLinkedList<>();
		NativeLoader.loadNative();

		{//1.0
			glfwInit 					= createCriticalMethodHandle("glfwInit", FunctionDescriptor.of(JAVA_INT));
			glfwTerminate 				= createCriticalMethodHandle("glfwTerminate", FunctionDescriptor.ofVoid());
			glfwGetVersion				= createCriticalMethodHandle("glfwGetVersion", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwSetWindowTitle			= createCriticalMethodHandle("glfwSetWindowTitle", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetWindowPos			= createCriticalMethodHandle("glfwSetWindowPos", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwGetWindowSize			= createCriticalMethodHandle("glfwGetWindowSize", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwSetWindowSize			= createCriticalMethodHandle("glfwSetWindowSize", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwExtensionSupported		= createCriticalMethodHandle("glfwExtensionSupported", FunctionDescriptor.of(JAVA_INT, JAVA_LONG));
			glfwGetProcAddress			= createNoCriticalMethodHandle("glfwGetProcAddress", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));

			/**
			 * MethodHandle initialization is non-critical because the native method pointed to by MethodHandle invokes callbacks to methods that reside in Java memory. 
			 * And if you mark MethodHandle as critical, then the Java Virtual Machine will crash
			 * */
			glfwPollEvents				= createNoCriticalMethodHandle("glfwPollEvents", FunctionDescriptor.ofVoid());
			glfwSwapBuffers				= createCriticalMethodHandle("glfwSwapBuffers", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwSwapInterval			= createCriticalMethodHandle("glfwSwapInterval", FunctionDescriptor.ofVoid(JAVA_INT));
			glfwSetWindowSizeCallback	= createNoCriticalMethodHandle("glfwSetWindowSizeCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetVideoModes			= createCriticalMethodHandle("glfwGetVideoModes", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetKey					= createCriticalMethodHandle("glfwGetKey", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT));
			glfwGetMouseButton			= createCriticalMethodHandle("glfwGetMouseButton", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT));
			glfwSetKeyCallback			= createNoCriticalMethodHandle("glfwSetKeyCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetMouseButtonCallback	= createNoCriticalMethodHandle("glfwSetMouseButtonCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetTime					= createCriticalMethodHandle("glfwGetTime", FunctionDescriptor.of(JAVA_DOUBLE));
		}

		{//2.1
			glfwIconifyWindow 			= createCriticalMethodHandle("glfwIconifyWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwRestoreWindow			= createCriticalMethodHandle("glfwRestoreWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
		}

		{//2.2
			glfwGetJoystickButtons		= createCriticalMethodHandle("glfwGetJoystickButtons", FunctionDescriptor.of(JAVA_LONG, JAVA_INT, JAVA_LONG));
			glfwSetTime					= createCriticalMethodHandle("glfwSetTime", FunctionDescriptor.ofVoid(JAVA_DOUBLE));
		}

		{//2.4
			glfwSetCharCallback			= createNoCriticalMethodHandle("glfwSetCharCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
		}

		{//2.5
			glfwSetWindowCloseCallback 		= createNoCriticalMethodHandle("glfwSetWindowCloseCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetWindowRefreshCallback 	= createNoCriticalMethodHandle("glfwSetWindowRefreshCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwWaitEvents					= createCriticalMethodHandle("glfwWaitEvents", FunctionDescriptor.ofVoid());
		}

		{//3.0
			glfwCreateWindow 					= createCriticalMethodHandle("glfwCreateWindow", FunctionDescriptor.of(JAVA_LONG,		JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwDefaultWindowHints  			= createCriticalMethodHandle("glfwDefaultWindowHints", FunctionDescriptor.ofVoid());
			glfwWindowHint 						= createCriticalMethodHandle("glfwWindowHint", FunctionDescriptor.ofVoid(JAVA_INT, JAVA_INT));
			glfwDestroyWindow					= createCriticalMethodHandle("glfwDestroyWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwWindowShouldClose				= createCriticalMethodHandle("glfwWindowShouldClose", FunctionDescriptor.of(JAVA_INT, JAVA_LONG));
			glfwSetWindowShouldClose 			= createCriticalMethodHandle("glfwSetWindowShouldClose", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT));
			glfwGetWindowPos					= createCriticalMethodHandle("glfwGetWindowPos", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetFramebufferSize				= createCriticalMethodHandle("glfwGetFramebufferSize", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwShowWindow						= createCriticalMethodHandle("glfwShowWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwHideWindow						= createCriticalMethodHandle("glfwHideWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwGetWindowMonitor				= createCriticalMethodHandle("glfwGetWindowMonitor", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwGetWindowAttrib					= createCriticalMethodHandle("glfwGetWindowAttrib", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT));
			glfwSetWindowUserPointer    		= createCriticalMethodHandle("glfwSetWindowUserPointer", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetWindowUserPointer			= createCriticalMethodHandle("glfwGetWindowUserPointer", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwSetWindowPosCallback			= createNoCriticalMethodHandle("glfwSetWindowPosCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetWindowFocusCallback			= createNoCriticalMethodHandle("glfwSetWindowFocusCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetWindowIconifyCallback		= createNoCriticalMethodHandle("glfwSetWindowIconifyCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetFramebufferSizeCallback 		= createNoCriticalMethodHandle("glfwSetFramebufferSizeCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwMakeContextCurrent				= createCriticalMethodHandle("glfwMakeContextCurrent", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwGetCurrentContext				= createCriticalMethodHandle("glfwGetCurrentContext", FunctionDescriptor.of(JAVA_LONG));
			glfwSetErrorCallback				= createNoCriticalMethodHandle("glfwSetErrorCallback", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwGetMonitors						= createCriticalMethodHandle("glfwGetMonitors", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwGetPrimaryMonitor				= createCriticalMethodHandle("glfwGetPrimaryMonitor", FunctionDescriptor.of(JAVA_LONG));
			glfwGetMonitorPos					= createCriticalMethodHandle("glfwGetMonitorPos", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetMonitorPhysicalSize			= createCriticalMethodHandle("glfwGetMonitorPhysicalSize", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetMonitorName					= createCriticalMethodHandle("glfwGetMonitorName", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwSetMonitorCallback				= createNoCriticalMethodHandle("glfwSetMonitorCallback", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwGetVideoMode					= createNoCriticalMethodHandle("glfwGetVideoMode", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwSetGamma						= createCriticalMethodHandle("glfwSetGamma", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_FLOAT));
			glfwGetGammaRamp					= createCriticalMethodHandle("glfwGetGammaRamp", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwSetGammaRamp					= createCriticalMethodHandle("glfwSetGammaRamp", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetInputMode					= createCriticalMethodHandle("glfwGetInputMode", FunctionDescriptor.of(JAVA_INT, JAVA_LONG, JAVA_INT));
			glfwSetInputMode					= createCriticalMethodHandle("glfwSetInputMode", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwGetCursorPos					= createCriticalMethodHandle("glfwGetCursorPos", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwSetCursorPos					= createCriticalMethodHandle("glfwSetCursorPos", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_DOUBLE, JAVA_DOUBLE));
			glfwSetCursorPosCallback			= createNoCriticalMethodHandle("glfwSetCursorPosCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetCursorEnterCallback			= createNoCriticalMethodHandle("glfwSetCursorEnterCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetScrollCallback				= createNoCriticalMethodHandle("glfwSetScrollCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwJoystickPresent					= createCriticalMethodHandle("glfwJoystickPresent", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
			glfwGetJoystickAxes					= createCriticalMethodHandle("glfwGetJoystickAxes", FunctionDescriptor.of(JAVA_LONG, JAVA_INT, JAVA_LONG));
			glfwGetJoystickName					= createCriticalMethodHandle("glfwGetJoystickName", FunctionDescriptor.of(JAVA_LONG, JAVA_INT));
			glfwSetClipboardString				= createCriticalMethodHandle("glfwSetClipboardString", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetClipboardString				= createCriticalMethodHandle("glfwGetClipboardString", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
		}

		{//3.1
			glfwGetWindowFrameSize		= createCriticalMethodHandle("glfwGetWindowFrameSize", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwPostEmptyEvent			= createCriticalMethodHandle("glfwPostEmptyEvent", FunctionDescriptor.ofVoid());
			glfwCreateCursor			= createCriticalMethodHandle("glfwCreateCursor", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwCreateStandardCursor	= createCriticalMethodHandle("glfwCreateStandardCursor", FunctionDescriptor.of(JAVA_LONG, JAVA_INT));
			glfwDestroyCursor			= createCriticalMethodHandle("glfwDestroyCursor", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwSetCursor				= createCriticalMethodHandle("glfwSetCursor", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetCharModsCallback		= createNoCriticalMethodHandle("glfwSetCharModsCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetDropCallback			= createNoCriticalMethodHandle("glfwSetDropCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
		}

		{//3.2
			glfwSetWindowIcon			= createCriticalMethodHandle("glfwSetWindowIcon", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_LONG));
			glfwSetWindowSizeLimits		= createCriticalMethodHandle("glfwSetWindowSizeLimits", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
			glfwSetWindowAspectRatio	= createCriticalMethodHandle("glfwSetWindowAspectRatio", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwMaximizeWindow			= createCriticalMethodHandle("glfwMaximizeWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwFocusWindow				= createCriticalMethodHandle("glfwFocusWindow", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwSetWindowMonitor		= createCriticalMethodHandle("glfwSetWindowMonitor", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
			glfwWaitEventsTimeout		= createCriticalMethodHandle("glfwWaitEventsTimeout", FunctionDescriptor.ofVoid(JAVA_DOUBLE));
			glfwGetKeyName				= createCriticalMethodHandle("glfwGetKeyName", FunctionDescriptor.of(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwSetJoystickCallback		= createNoCriticalMethodHandle("glfwSetJoystickCallback", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwGetTimerValue			= createCriticalMethodHandle("glfwGetTimerValue", FunctionDescriptor.of(JAVA_LONG));
			glfwGetTimerFrequency		= createCriticalMethodHandle("glfwGetTimerFrequency", FunctionDescriptor.of(JAVA_LONG));
		}

		{//3.3
			glfwWindowHintString    			= createCriticalMethodHandle("glfwWindowHintString", FunctionDescriptor.ofVoid(JAVA_INT, JAVA_LONG));	
			glfwGetWindowContentScale			= createCriticalMethodHandle("glfwGetWindowContentScale", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetWindowOpacity				= createCriticalMethodHandle("glfwGetWindowOpacity", FunctionDescriptor.of(JAVA_FLOAT, JAVA_LONG));
			glfwSetWindowOpacity				= createCriticalMethodHandle("glfwSetWindowOpacity", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_FLOAT));
			glfwRequestWindowAttention			= createCriticalMethodHandle("glfwRequestWindowAttention", FunctionDescriptor.ofVoid(JAVA_LONG));
			glfwSetWindowAttrib					= createCriticalMethodHandle("glfwSetWindowAttrib", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_INT, JAVA_INT));
			glfwSetWindowMaximizeCallback 		= createNoCriticalMethodHandle("glfwSetWindowMaximizeCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwSetWindowContentScaleCallback 	= createNoCriticalMethodHandle("glfwSetWindowContentScaleCallback", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG)); 
			glfwGetError						= createCriticalMethodHandle("glfwGetError", FunctionDescriptor.of(JAVA_INT, JAVA_LONG));
			glfwGetMonitorWorkarea				= createCriticalMethodHandle("glfwGetMonitorWorkarea", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwGetMonitorContentScale			= createCriticalMethodHandle("glfwGetMonitorContentScale", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG, JAVA_LONG));
			glfwSetMonitorUserPointer			= createCriticalMethodHandle("glfwSetMonitorUserPointer", FunctionDescriptor.ofVoid(JAVA_LONG, JAVA_LONG));
			glfwGetMonitorUserPointer			= createCriticalMethodHandle("glfwGetMonitorUserPointer", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));
			glfwRawMouseMotionSupported			= createCriticalMethodHandle("glfwRawMouseMotionSupported", FunctionDescriptor.of(JAVA_INT));
			glfwGetKeyScancode					= createCriticalMethodHandle("glfwGetKeyScancode", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
			glfwGetJoystickHats					= createCriticalMethodHandle("glfwGetJoystickHats", FunctionDescriptor.of(JAVA_LONG, JAVA_INT, JAVA_LONG));
			glfwGetJoystickGUID					= createCriticalMethodHandle("glfwGetJoystickGUID", FunctionDescriptor.of(JAVA_LONG, JAVA_INT));
			glfwSetJoystickUserPointer			= createCriticalMethodHandle("glfwSetJoystickUserPointer", FunctionDescriptor.ofVoid(JAVA_INT, JAVA_LONG));
			glfwGetJoystickUserPointer			= createCriticalMethodHandle("glfwGetJoystickUserPointer", FunctionDescriptor.of(JAVA_LONG, JAVA_INT));
			glfwJoystickIsGamepad				= createCriticalMethodHandle("glfwJoystickIsGamepad", FunctionDescriptor.of(JAVA_INT, JAVA_INT));
			glfwUpdateGamepadMappings			= createCriticalMethodHandle("glfwUpdateGamepadMappings", FunctionDescriptor.of(JAVA_INT, JAVA_LONG));
			glfwGetGamepadName					= createCriticalMethodHandle("glfwGetGamepadName", FunctionDescriptor.of(JAVA_LONG, JAVA_INT));
			glfwGetGamepadState					= createCriticalMethodHandle("glfwGetGamepadState", FunctionDescriptor.of(JAVA_INT, JAVA_INT, JAVA_LONG));
		}

		{//3.4
			glfwGetWindowTitle					= createCriticalMethodHandle("glfwGetWindowTitle", FunctionDescriptor.of(JAVA_LONG, JAVA_LONG));		
		}
	}
}
