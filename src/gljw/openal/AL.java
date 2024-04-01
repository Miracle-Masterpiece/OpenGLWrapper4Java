/*========================== SOFT-OPENAL LICENSE ==========================
 * 
 *                   GNU LIBRARY GENERAL PUBLIC LICENSE
 *                     Version 2, June 1991
 *                       
 * Copyright (C) 1991 Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 * [This is the first released version of the library GPL.  It is
 * numbered 2 because it goes with version 2 of the ordinary GPL.]
 *
 *                           Preamble
 *
 * The licenses for most software are designed to take away your
 * freedom to share and change it.  By contrast, the GNU General Public
 * Licenses are intended to guarantee your freedom to share and change
 * free software--to make sure the software is free for all its users.
 * 
 * This license, the Library General Public License, applies to some
 * specially designated Free Software Foundation software, and to any
 * other libraries whose authors decide to use it.  You can use it for
 * your libraries, too.
 * 
 * When we speak of free software, we are referring to freedom, not
 * price.  Our General Public Licenses are designed to make sure that you
 * have the freedom to distribute copies of free software (and charge for
 * this service if you wish), that you receive source code or can get it
 * if you want it, that you can change the software or use pieces of it
 * in new free programs; and that you know you can do these things.
 * 
 * To protect your rights, we need to make restrictions that forbid
 * anyone to deny you these rights or to ask you to surrender the rights.
 * These restrictions translate to certain responsibilities for you if
 * you distribute copies of the library, or if you modify it.
 * 
 * For example, if you distribute copies of the library, whether gratis
 * or for a fee, you must give the recipients all the rights that we gave
 * you.  You must make sure that they, too, receive or can get the source
 * code.  If you link a program with the library, you must provide
 * complete object files to the recipients so that they can relink them
 * with the library, after making changes to the library and recompiling
 * it.  And you must show them these terms so they know their rights.
 * 
 * Our method of protecting your rights has two steps: (1) copyright
 * the library, and (2) offer you this license which gives you legal
 * permission to copy, distribute and/or modify the library.
 * 
 * Also, for each distributor's protection, we want to make certain
 * that everyone understands that there is no warranty for this free
 * library.  If the library is modified by someone else and passed on, we
 * want its recipients to know that what they have is not the original
 * version, so that any problems introduced by others will not reflect on
 * the original authors' reputations.
 * 
 * Finally, any free program is threatened constantly by software
 * patents.  We wish to avoid the danger that companies distributing free
 * software will individually obtain patent licenses, thus in effect
 * transforming the program into proprietary software.  To prevent this,
 * we have made it clear that any patent must be licensed for everyone's
 * free use or not licensed at all.
 * 
 * Most GNU software, including some libraries, is covered by the ordinary
 * GNU General Public License, which was designed for utility programs.  This
 * license, the GNU Library General Public License, applies to certain
 * designated libraries.  This license is quite different from the ordinary
 * one; be sure to read it in full, and don't assume that anything in it is
 * the same as in the ordinary license.
 * 
 * The reason we have a separate public license for some libraries is that
 * they blur the distinction we usually make between modifying or adding to a
 * program and simply using it.  Linking a program with a library, without
 * changing the library, is in some sense simply using the library, and is
 * analogous to running a utility program or application program.  However, in
 * a textual and legal sense, the linked executable is a combined work, a
 * derivative of the original library, and the ordinary General Public License
 * treats it as such.
 * 
 * Because of this blurred distinction, using the ordinary General
 * Public License for libraries did not effectively promote software
 * sharing, because most developers did not use the libraries.  We
 * concluded that weaker conditions might promote sharing better.
 * 
 * However, unrestricted linking of non-free programs would deprive the
 * users of those programs of all benefit from the free status of the
 * libraries themselves.  This Library General Public License is intended to
 * permit developers of non-free programs to use free libraries, while
 * preserving your freedom as a user of such programs to change the free
 * libraries that are incorporated in them.  (We have not seen how to achieve
 * this as regards changes in header files, but we have achieved it as regards
 * changes in the actual functions of the Library.)  The hope is that this
 * will lead to faster development of free libraries.
 * 
 * The precise terms and conditions for copying, distribution and
 * modification follow.  Pay close attention to the difference between a
 * "work based on the library" and a "work that uses the library".  The
 * former contains code derived from the library, while the latter only
 * works together with the library.
 * 
 * Note that it is possible for a library to be covered by the ordinary
 * General Public License rather than by this special one.
 * 
 *                GNU LIBRARY GENERAL PUBLIC LICENSE
 * TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 * 
 * 0. This License Agreement applies to any software library which
 * contains a notice placed by the copyright holder or other authorized
 * party saying it may be distributed under the terms of this Library
 * General Public License (also called "this License").  Each licensee is
 * addressed as "you".
 * 
 * A "library" means a collection of software functions and/or data
 * prepared so as to be conveniently linked with application programs
 * (which use some of those functions and data) to form executables.
 * 
 * The "Library", below, refers to any such software library or work
 * which has been distributed under these terms.  A "work based on the
 * Library" means either the Library or any derivative work under
 * copyright law: that is to say, a work containing the Library or a
 * portion of it, either verbatim or with modifications and/or translated
 * straightforwardly into another language.  (Hereinafter, translation is
 * included without limitation in the term "modification".)
 * 
 * "Source code" for a work means the preferred form of the work for
 * making modifications to it.  For a library, complete source code means
 * all the source code for all modules it contains, plus any associated
 * interface definition files, plus the scripts used to control compilation
 * and installation of the library.
 * 
 * Activities other than copying, distribution and modification are not
 * covered by this License; they are outside its scope.  The act of
 * running a program using the Library is not restricted, and output from
 * such a program is covered only if its contents constitute a work based
 * on the Library (independent of the use of the Library in a tool for
 * writing it).  Whether that is true depends on what the Library does
 * and what the program that uses the Library does.
 * 
 * 1. You may copy and distribute verbatim copies of the Library's
 * complete source code as you receive it, in any medium, provided that
 * you conspicuously and appropriately publish on each copy an
 * appropriate copyright notice and disclaimer of warranty; keep intact
 * all the notices that refer to this License and to the absence of any
 * warranty; and distribute a copy of this License along with the
 * Library.
 * 
 * You may charge a fee for the physical act of transferring a copy,
 * and you may at your option offer warranty protection in exchange for a
 * fee.
 * 
 * 2. You may modify your copy or copies of the Library or any portion
 * of it, thus forming a work based on the Library, and copy and
 * distribute such modifications or work under the terms of Section 1
 * above, provided that you also meet all of these conditions:
 * 
 * a) The modified work must itself be a software library.
 * 
 * b) You must cause the files modified to carry prominent notices
 * stating that you changed the files and the date of any change.
 * 
 * c) You must cause the whole of the work to be licensed at no
 * charge to all third parties under the terms of this License.
 * 
 * d) If a facility in the modified Library refers to a function or a
 * table of data to be supplied by an application program that uses
 * the facility, other than as an argument passed when the facility
 * is invoked, then you must make a good faith effort to ensure that,
 * in the event an application does not supply such function or
 * table, the facility still operates, and performs whatever part of
 * its purpose remains meaningful.
 * 
 * (For example, a function in a library to compute square roots has
 * a purpose that is entirely well-defined independent of the
 * application.  Therefore, Subsection 2d requires that any
 * application-supplied function or table used by this function must
 * be optional: if the application does not supply it, the square
 * root function must still compute square roots.)
 * 
 * These requirements apply to the modified work as a whole.  If
 * identifiable sections of that work are not derived from the Library,
 * and can be reasonably considered independent and separate works in
 * themselves, then this License, and its terms, do not apply to those
 * sections when you distribute them as separate works.  But when you
 * distribute the same sections as part of a whole which is a work based
 * on the Library, the distribution of the whole must be on the terms of
 * this License, whose permissions for other licensees extend to the
 * entire whole, and thus to each and every part regardless of who wrote it.
 * 
 * Thus, it is not the intent of this section to claim rights or contest
 * your rights to work written entirely by you; rather, the intent is to
 * exercise the right to control the distribution of derivative or
 * collective works based on the Library.
 * 
 * In addition, mere aggregation of another work not based on the Library
 * with the Library (or with a work based on the Library) on a volume of
 * a storage or distribution medium does not bring the other work under
 * the scope of this License.
 * 
 * 3. You may opt to apply the terms of the ordinary GNU General Public
 * License instead of this License to a given copy of the Library.  To do
 * this, you must alter all the notices that refer to this License, so
 * that they refer to the ordinary GNU General Public License, version 2,
 * instead of to this License.  (If a newer version than version 2 of the
 * ordinary GNU General Public License has appeared, then you can specify
 * that version instead if you wish.)  Do not make any other change in
 * these notices.
 * 
 * Once this change is made in a given copy, it is irreversible for
 * that copy, so the ordinary GNU General Public License applies to all
 * subsequent copies and derivative works made from that copy.
 * 
 * This option is useful when you wish to copy part of the code of
 * the Library into a program that is not a library.
 * 
 * 4. You may copy and distribute the Library (or a portion or
 * derivative of it, under Section 2) in object code or executable form
 * under the terms of Sections 1 and 2 above provided that you accompany
 * it with the complete corresponding machine-readable source code, which
 * must be distributed under the terms of Sections 1 and 2 above on a
 * medium customarily used for software interchange.
 * 
 * If distribution of object code is made by offering access to copy
 * from a designated place, then offering equivalent access to copy the
 * source code from the same place satisfies the requirement to
 * distribute the source code, even though third parties are not
 * compelled to copy the source along with the object code.
 * 
 * 5. A program that contains no derivative of any portion of the
 * Library, but is designed to work with the Library by being compiled or
 * linked with it, is called a "work that uses the Library".  Such a
 * work, in isolation, is not a derivative work of the Library, and
 * therefore falls outside the scope of this License.
 * 
 * However, linking a "work that uses the Library" with the Library
 * creates an executable that is a derivative of the Library (because it
 * contains portions of the Library), rather than a "work that uses the
 * library".  The executable is therefore covered by this License.
 * Section 6 states terms for distribution of such executables.
 * 
 * When a "work that uses the Library" uses material from a header file
 * that is part of the Library, the object code for the work may be a
 * derivative work of the Library even though the source code is not.
 * Whether this is true is especially significant if the work can be
 * linked without the Library, or if the work is itself a library.  The
 * threshold for this to be true is not precisely defined by law.
 * 
 * If such an object file uses only numerical parameters, data
 * structure layouts and accessors, and small macros and small inline
 * functions (ten lines or less in length), then the use of the object
 * file is unrestricted, regardless of whether it is legally a derivative
 * work.  (Executables containing this object code plus portions of the
 * Library will still fall under Section 6.)
 * 
 * Otherwise, if the work is a derivative of the Library, you may
 * distribute the object code for the work under the terms of Section 6.
 * Any executables containing that work also fall under Section 6,
 * whether or not they are linked directly with the Library itself.
 * 
 * 6. As an exception to the Sections above, you may also compile or
 * link a "work that uses the Library" with the Library to produce a
 * work containing portions of the Library, and distribute that work
 * under terms of your choice, provided that the terms permit
 * modification of the work for the customer's own use and reverse
 * engineering for debugging such modifications.
 * 
 * You must give prominent notice with each copy of the work that the
 * Library is used in it and that the Library and its use are covered by
 * this License.  You must supply a copy of this License.  If the work
 * during execution displays copyright notices, you must include the
 * copyright notice for the Library among them, as well as a reference
 * directing the user to the copy of this License.  Also, you must do one
 * of these things:
 * 
 * a) Accompany the work with the complete corresponding
 * machine-readable source code for the Library including whatever
 * changes were used in the work (which must be distributed under
 * Sections 1 and 2 above); and, if the work is an executable linked
 * with the Library, with the complete machine-readable "work that
 * uses the Library", as object code and/or source code, so that the
 * user can modify the Library and then relink to produce a modified
 * executable containing the modified Library.  (It is understood
 * that the user who changes the contents of definitions files in the
 * Library will not necessarily be able to recompile the application
 * to use the modified definitions.)
 * 
 * b) Accompany the work with a written offer, valid for at
 * least three years, to give the same user the materials
 * specified in Subsection 6a, above, for a charge no more
 * than the cost of performing this distribution.
 * 
 * c) If distribution of the work is made by offering access to copy
 * from a designated place, offer equivalent access to copy the above
 * specified materials from the same place.
 * d) Verify that the user has already received a copy of these
 * materials or that you have already sent this user a copy.
 * 
 * For an executable, the required form of the "work that uses the
 * Library" must include any data and utility programs needed for
 * reproducing the executable from it.  However, as a special exception,
 * the source code distributed need not include anything that is normally
 * distributed (in either source or binary form) with the major
 * components (compiler, kernel, and so on) of the operating system on
 * which the executable runs, unless that component itself accompanies
 * the executable.
 * 
 * It may happen that this requirement contradicts the license
 * restrictions of other proprietary libraries that do not normally
 * accompany the operating system.  Such a contradiction means you cannot
 * use both them and the Library together in an executable that you
 * distribute.
 * 
 * 7. You may place library facilities that are a work based on the
 * Library side-by-side in a single library together with other library
 * facilities not covered by this License, and distribute such a combined
 * library, provided that the separate distribution of the work based on
 * the Library and of the other library facilities is otherwise
 * permitted, and provided that you do these two things:
 * 
 * a) Accompany the combined library with a copy of the same work
 * based on the Library, uncombined with any other library
 * facilities.  This must be distributed under the terms of the
 * Sections above.
 * 
 * b) Give prominent notice with the combined library of the fact
 * that part of it is a work based on the Library, and explaining
 * where to find the accompanying uncombined form of the same work.
 * 
 * 
 * 8. You may not copy, modify, sublicense, link with, or distribute
 * the Library except as expressly provided under this License.  Any
 * attempt otherwise to copy, modify, sublicense, link with, or
 * distribute the Library is void, and will automatically terminate your
 * rights under this License.  However, parties who have received copies,
 * or rights, from you under this License will not have their licenses
 * terminated so long as such parties remain in full compliance.
 * 
 * 9. You are not required to accept this License, since you have not
 * signed it.  However, nothing else grants you permission to modify or
 * distribute the Library or its derivative works.  These actions are
 * prohibited by law if you do not accept this License.  Therefore, by
 * modifying or distributing the Library (or any work based on the
 * Library), you indicate your acceptance of this License to do so, and
 * all its terms and conditions for copying, distributing or modifying
 * the Library or works based on it.
 * 
 * 10. Each time you redistribute the Library (or any work based on the
 * Library), the recipient automatically receives a license from the
 * original licensor to copy, distribute, link with or modify the Library
 * subject to these terms and conditions.  You may not impose any further
 * restrictions on the recipients' exercise of the rights granted herein.
 * You are not responsible for enforcing compliance by third parties to
 * this License.
 * 
 * 11. If, as a consequence of a court judgment or allegation of patent
 * infringement or for any other reason (not limited to patent issues),
 * conditions are imposed on you (whether by court order, agreement or
 * otherwise) that contradict the conditions of this License, they do not
 * excuse you from the conditions of this License.  If you cannot
 * distribute so as to satisfy simultaneously your obligations under this
 * License and any other pertinent obligations, then as a consequence you
 * may not distribute the Library at all.  For example, if a patent
 * license would not permit royalty-free redistribution of the Library by
 * all those who receive copies directly or indirectly through you, then
 * the only way you could satisfy both it and this License would be to
 * refrain entirely from distribution of the Library.
 * 
 * If any portion of this section is held invalid or unenforceable under any
 * particular circumstance, the balance of the section is intended to apply,
 * and the section as a whole is intended to apply in other circumstances.
 * 
 * It is not the purpose of this section to induce you to infringe any
 * patents or other property right claims or to contest validity of any
 * such claims; this section has the sole purpose of protecting the
 * integrity of the free software distribution system which is
 * implemented by public license practices.  Many people have made
 * generous contributions to the wide range of software distributed
 * through that system in reliance on consistent application of that
 * system; it is up to the author/donor to decide if he or she is willing
 * to distribute software through any other system and a licensee cannot
 * impose that choice.
 * 
 * This section is intended to make thoroughly clear what is believed to
 * be a consequence of the rest of this License.
 * 
 * 12. If the distribution and/or use of the Library is restricted in
 * certain countries either by patents or by copyrighted interfaces, the
 * original copyright holder who places the Library under this License may add
 * an explicit geographical distribution limitation excluding those countries,
 * so that distribution is permitted only in or among countries not thus
 * excluded.  In such case, this License incorporates the limitation as if
 * written in the body of this License.
 * 
 * 13. The Free Software Foundation may publish revised and/or new
 * versions of the Library General Public License from time to time.
 * Such new versions will be similar in spirit to the present version,
 * but may differ in detail to address new problems or concerns.
 * 
 * Each version is given a distinguishing version number.  If the Library
 * specifies a version number of this License which applies to it and
 * "any later version", you have the option of following the terms and
 * conditions either of that version or of any later version published by
 * the Free Software Foundation.  If the Library does not specify a
 * license version number, you may choose any version ever published by
 * the Free Software Foundation.
 * 
 * 14. If you wish to incorporate parts of the Library into other free
 * programs whose distribution conditions are incompatible with these,
 * write to the author to ask for permission.  For software which is
 * copyrighted by the Free Software Foundation, write to the Free
 * Software Foundation; we sometimes make exceptions for this.  Our
 * decision will be guided by the two goals of preserving the free status
 * of all derivatives of our free software and of promoting the sharing
 * and reuse of software generally.
 * 
 *                          NO WARRANTY
 *
 * 15. BECAUSE THE LIBRARY IS LICENSED FREE OF CHARGE, THERE IS NO
 * WARRANTY FOR THE LIBRARY, TO THE EXTENT PERMITTED BY APPLICABLE LAW.
 * EXCEPT WHEN OTHERWISE STATED IN WRITING THE COPYRIGHT HOLDERS AND/OR
 * OTHER PARTIES PROVIDE THE LIBRARY "AS IS" WITHOUT WARRANTY OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.  THE ENTIRE RISK AS TO THE QUALITY AND PERFORMANCE OF THE
 * LIBRARY IS WITH YOU.  SHOULD THE LIBRARY PROVE DEFECTIVE, YOU ASSUME
 * THE COST OF ALL NECESSARY SERVICING, REPAIR OR CORRECTION.
 * 
 * 16. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO INWRITING WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY
 * AND/OR REDISTRIBUTE THE LIBRARY AS PERMITTED ABOVE, BE LIABLE TO YOU
 * FOR DAMAGES, INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR
 * CONSEQUENTIAL DAMAGES ARISING OUT OF THE USE OR INABILITY TO USE THE
 * LIBRARY (INCLUDING BUT NOT LIMITED TO LOSS OF DATA OR DATA BEING
 * RENDERED INACCURATE OR LOSSES SUSTAINED BY YOU OR THIRD PARTIES OR A
 * FAILURE OF THE LIBRARY TO OPERATE WITH ANY OTHER SOFTWARE), EVEN IF
 * SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH
 * DAMAGES.
 *
 *                    END OF TERMS AND CONDITIONS
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

/*========================== OPENAL LICENSE ==========================
 * OpenAL cross platform audio library
 * Copyright (C) 2008 by authors.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * Or go to http://www.gnu.org/copyleft/lgpl.html
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
package gljw.openal;

import java.lang.invoke.MethodHandle;
import gljw.annotations.Ctype;
import gljw.helpers.WavData;

import static gljw.helpers.Helpers.createCriticalMethodHandle;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;

public final class AL {

	private AL() { throw new IllegalAccessError(); }

	/* Enumeration values begin at column 50. Do not use tabs. */

	/** No distance model or no buffer */
	public static final byte AL_NONE = 0;

	/** Boolean False. */
	public static final byte AL_FALSE = 0;

	/** Boolean True. */
	public static final byte AL_TRUE = 1;

	/**
	 * Relative source.
	 * Type:    ALboolean
	 * Range:   [AL_FALSE, AL_TRUE]
	 * Default: AL_FALSE
	 *
	 * Specifies if the source uses relative coordinates.
	 */
	public static final char AL_SOURCE_RELATIVE = 0x202;


	/**
	 * Inner cone angle, in degrees.
	 * Type:    ALint, ALfloat
	 * Range:   [0 - 360]
	 * Default: 360
	 *
	 * The angle covered by the inner cone, the area within which the source will
	 * not be attenuated by direction.
	 */
	public static final char AL_CONE_INNER_ANGLE = 0x1001;

	/**
	 * Outer cone angle, in degrees.
	 * Range:   [0 - 360]
	 * Default: 360
	 *
	 * The angle covered by the outer cone, the area outside of which the source
	 * will be fully attenuated by direction.
	 */
	public static final char AL_CONE_OUTER_ANGLE = 0x1002;

	/**
	 * Source pitch.
	 * Type:    ALfloat
	 * Range:   [0.5 - 2.0]
	 * Default: 1.0
	 *
	 * A multiplier for the sample rate of the source's buffer.
	 */
	public static final char AL_PITCH = 0x1003;

	/**
	 * Source or listener position.
	 * Type:    ALfloat[3], ALint[3]
	 * Default: {0, 0, 0}
	 *
	 * The source or listener location in three dimensional space.
	 *
	 * OpenAL uses a right handed coordinate system, like OpenGL, where with a
	 * default view, X points right (thumb), Y points up (index finger), and Z
	 * points towards the viewer/camera (middle finger).
	 *
	 * To change from or to a left handed coordinate system, negate the Z
	 * component.
	 */
	public static final char AL_POSITION = 0x1004;

	/**
	 * Source direction.
	 * Type:    ALfloat[3], ALint[3]
	 * Default: {0, 0, 0}
	 *
	 * Specifies the current direction in local space. A zero-length vector
	 * specifies an omni-directional source (cone is ignored).
	 *
	 * To change from or to a left handed coordinate system, negate the Z
	 * component.
	 */
	public static final char AL_DIRECTION = 0x1005;

	/**
	 * Source or listener velocity.
	 * Type:    ALfloat[3], ALint[3]
	 * Default: {0, 0, 0}
	 *
	 * Specifies the current velocity, relative to the position.
	 *
	 * To change from or to a left handed coordinate system, negate the Z
	 * component.
	 */
	public static final char AL_VELOCITY = 0x1006;

	/**
	 * Source looping.
	 * Type:    ALboolean
	 * Range:   [AL_FALSE, AL_TRUE]
	 * Default: AL_FALSE
	 *
	 * Specifies whether source playback loops.
	 */
	public static final char AL_LOOPING = 0x1007;

	/**
	 * Source buffer.
	 * Type:    ALuint
	 * Range:   any valid Buffer ID
	 * Default: AL_NONE
	 *
	 * Specifies the buffer to provide sound samples for a source.
	 */
	public static final char AL_BUFFER = 0x1009;

	/**
	 * Source or listener gain.
	 * Type:  ALfloat
	 * Range: [0.0 - ]
	 *
	 * For sources, an initial linear gain value (before attenuation is applied).
	 * For the listener, an output linear gain adjustment.
	 *
	 * A value of 1.0 means unattenuated. Each division by 2 equals an attenuation
	 * of about -6dB. Each multiplication by 2 equals an amplification of about
	 * +6dB.
	 */
	public static final char AL_GAIN = 0x100A;

	/**
	 * Minimum source gain.
	 * Type:  ALfloat
	 * Range: [0.0 - 1.0]
	 *
	 * The minimum gain allowed for a source, after distance and cone attenuation
	 * are applied (if applicable).
	 */
	public static final char AL_MIN_GAIN = 0x100D;

	/**
	 * Maximum source gain.
	 * Type:  ALfloat
	 * Range: [0.0 - 1.0]
	 *
	 * The maximum gain allowed for a source, after distance and cone attenuation
	 * are applied (if applicable).
	 */
	public static final char AL_MAX_GAIN = 0x100E;

	/**
	 * Listener orientation.
	 * Type:    ALfloat[6]
	 * Default: {0.0, 0.0, -1.0, 0.0, 1.0, 0.0}
	 *
	 * Effectively two three dimensional vectors. The first vector is the front (or
	 * "at") and the second is the top (or "up"). Both vectors are relative to the
	 * listener position.
	 *
	 * To change from or to a left handed coordinate system, negate the Z
	 * component of both vectors.
	 */
	public static final char AL_ORIENTATION = 0x100F;

	/**
	 * Source state (query only).
	 * Type:  ALenum
	 * Range: [AL_INITIAL, AL_PLAYING, AL_PAUSED, AL_STOPPED]
	 */
	public static final char AL_SOURCE_STATE = 0x1010;

	/* Source state values. */
	public static final char AL_INITIAL = 0x1011;
	public static final char AL_PLAYING = 0x1012;
	public static final char AL_PAUSED = 0x1013;
	public static final char AL_STOPPED = 0x1014;

	/**
	 * Source Buffer Queue size (query only).
	 * Type: ALint
	 *
	 * The number of buffers queued using alSourceQueueBuffers, minus the buffers
	 * removed with alSourceUnqueueBuffers.
	 */
	public static final char AL_BUFFERS_QUEUED = 0x1015;

	/**
	 * Source Buffer Queue processed count (query only).
	 * Type: ALint
	 *
	 * The number of queued buffers that have been fully processed, and can be
	 * removed with alSourceUnqueueBuffers.
	 *
	 * Looping sources will never fully process buffers because they will be set to
	 * play again for when the source loops.
	 */
	public static final char AL_BUFFERS_PROCESSED = 0x1016;

	/**
	 * Source reference distance.
	 * Type:    ALfloat
	 * Range:   [0.0 - ]
	 * Default: 1.0
	 *
	 * The distance in units that no distance attenuation occurs.
	 *
	 * At 0.0, no distance attenuation occurs with non-linear attenuation models.
	 */
	public static final char AL_REFERENCE_DISTANCE = 0x1020;

	/**
	 * Source rolloff factor.
	 * Type:    ALfloat
	 * Range:   [0.0 - ]
	 * Default: 1.0
	 *
	 * Multiplier to exaggerate or diminish distance attenuation.
	 *
	 * At 0.0, no distance attenuation ever occurs.
	 */
	public static final char AL_ROLLOFF_FACTOR = 0x1021;

	/**
	 * Outer cone gain.
	 * Type:    ALfloat
	 * Range:   [0.0 - 1.0]
	 * Default: 0.0
	 *
	 * The gain attenuation applied when the listener is outside of the source's
	 * outer cone angle.
	 */
	public static final char AL_CONE_OUTER_GAIN = 0x1022;

	/**
	 * Source maximum distance.
	 * Type:    ALfloat
	 * Range:   [0.0 - ]
	 * Default: FLT_MAX
	 *
	 * The distance above which the source is not attenuated any further with a
	 * clamped distance model, or where attenuation reaches 0.0 gain for linear
	 * distance models with a default rolloff factor.
	 */
	public static final char AL_MAX_DISTANCE = 0x1023;

	/** Source buffer offset, in seconds */
	public static final char AL_SEC_OFFSET = 0x1024;
	/** Source buffer offset, in sample frames */
	public static final char AL_SAMPLE_OFFSET = 0x1025;
	/** Source buffer offset, in bytes */
	public static final char AL_BYTE_OFFSET = 0x1026;

	/**
	 * Source type (query only).
	 * Type:  ALenum
	 * Range: [AL_STATIC, AL_STREAMING, AL_UNDETERMINED]
	 *
	 * A Source is Static if a Buffer has been attached using AL_BUFFER.
	 *
	 * A Source is Streaming if one or more Buffers have been attached using
	 * alSourceQueueBuffers.
	 *
	 * A Source is Undetermined when it has the NULL buffer attached using
	 * AL_BUFFER.
	 */
	public static final char AL_SOURCE_TYPE = 0x1027;

	/* Source type values. */
	public static final char AL_STATIC = 0x1028;
	public static final char AL_STREAMING = 0x1029;
	public static final char AL_UNDETERMINED = 0x1030;

	/** Unsigned 8-bit mono buffer format. */
	public static final char AL_FORMAT_MONO8 = 0x1100;
	/** Signed 16-bit mono buffer format. */
	public static final char AL_FORMAT_MONO16 = 0x1101;
	/** Unsigned 8-bit stereo buffer format. */
	public static final char AL_FORMAT_STEREO8 = 0x1102;
	/** Signed 16-bit stereo buffer format. */
	public static final char AL_FORMAT_STEREO16 = 0x1103;

	/** Buffer frequency/sample rate (query only). */
	public static final char AL_FREQUENCY = 0x2001;
	/** Buffer bits per sample (query only). */
	public static final char AL_BITS = 0x2002;
	/** Buffer channel count (query only). */
	public static final char AL_CHANNELS = 0x2003;
	/** Buffer data size in bytes (query only). */
	public static final char AL_SIZE = 0x2004;

	/* Buffer state. Not for public use. */
	public static final char AL_UNUSED = 0x2010;
	public static final char AL_PENDING = 0x2011;
	public static final char AL_PROCESSED = 0x2012;


	/** No error. */
	public static final byte AL_NO_ERROR = 0;

	/** Invalid name (ID) passed to an AL call. */
	public static final char AL_INVALID_NAME = 0xA001;

	/** Invalid enumeration passed to AL call. */
	public static final char AL_INVALID_ENUM = 0xA002;

	/** Invalid value passed to AL call. */
	public static final char AL_INVALID_VALUE = 0xA003;

	/** Illegal AL call. */
	public static final char AL_INVALID_OPERATION = 0xA004;

	/** Not enough memory to execute the AL call. */
	public static final char AL_OUT_OF_MEMORY = 0xA005;


	/** Context string: Vendor name. */
	public static final char AL_VENDOR = 0xB001;
	/** Context string: Version. */
	public static final char AL_VERSION = 0xB002;
	/** Context string: Renderer name. */
	public static final char AL_RENDERER = 0xB003;
	/** Context string: Space-separated extension list. */
	public static final char AL_EXTENSIONS = 0xB004;

	/**
	 * Doppler scale.
	 * Type:    ALfloat
	 * Range:   [0.0 - ]
	 * Default: 1.0
	 *
	 * Scale for source and listener velocities.
	 */
	public static final char AL_DOPPLER_FACTOR = 0xC000;

	/**
	 * Doppler velocity (deprecated).
	 *
	 * A multiplier applied to the Speed of Sound.
	 */
	public static final char AL_DOPPLER_VELOCITY = 0xC001;

	/**
	 * Speed of Sound, in units per second.
	 * Type:    ALfloat
	 * Range:   [0.0001 - ]
	 * Default: 343.3
	 *
	 * The speed at which sound waves are assumed to travel, when calculating the
	 * doppler effect from source and listener velocities.
	 */
	public static final char AL_SPEED_OF_SOUND = 0xC003;

	/**
	 * Distance attenuation model.
	 * Type:    ALenum
	 * Range:   [AL_NONE, AL_INVERSE_DISTANCE, AL_INVERSE_DISTANCE_CLAMPED,
	 *           AL_LINEAR_DISTANCE, AL_LINEAR_DISTANCE_CLAMPED,
	 *           AL_EXPONENT_DISTANCE, AL_EXPONENT_DISTANCE_CLAMPED]
	 * Default: AL_INVERSE_DISTANCE_CLAMPED
	 *
	 * The model by which sources attenuate with distance.
	 *
	 * None     - No distance attenuation.
	 * Inverse  - Doubling the distance halves the source gain.
	 * Linear   - Linear gain scaling between the reference and max distances.
	 * Exponent - Exponential gain dropoff.
	 *
	 * Clamped variations work like the non-clamped counterparts, except the
	 * distance calculated is clamped between the reference and max distances.
	 */
	public static final char AL_DISTANCE_MODEL = 0xD000;

	/* Distance model values. */
	public static final char AL_INVERSE_DISTANCE = 0xD001;
	public static final char AL_INVERSE_DISTANCE_CLAMPED = 0xD002;
	public static final char AL_LINEAR_DISTANCE = 0xD003;
	public static final char AL_LINEAR_DISTANCE_CLAMPED = 0xD004;
	public static final char AL_EXPONENT_DISTANCE = 0xD005;
	public static final char AL_EXPONENT_DISTANCE_CLAMPED = 0xD006;

	/** Renderer State management. */
	public static void alEnable(@Ctype("ALenum") int capability){
		try{
			alEnable.invoke(capability);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alEnable = createCriticalMethodHandle("alEnable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static void alDisable(@Ctype("ALenum") int capability){
		try{
			alDisable.invoke(capability);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alDisable = createCriticalMethodHandle("alDisable", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	public static @Ctype("ALboolean") boolean alIsEnabled(@Ctype("ALenum") int capability){
		try{
			return (boolean)alIsEnabled.invoke(capability);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alIsEnabled = createCriticalMethodHandle("alIsEnabled", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	/** State retrieval. */
	public static @Ctype("ALchar*")long alGetString(@Ctype("ALenum") int param){
		try{
			return (long)alGetString.invoke(param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetString = createCriticalMethodHandle("alGetString", FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));

	public static void alGetBooleanv(@Ctype("ALenum") int param, @Ctype("ALboolean*") long values){
		try{
			alGetBooleanv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBooleanv = createCriticalMethodHandle("alGetBooleanv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetIntegerv(@Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alGetIntegerv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetIntegerv = createCriticalMethodHandle("alGetIntegerv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetFloatv(@Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alGetFloatv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetFloatv = createCriticalMethodHandle("alGetFloatv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetDoublev(@Ctype("ALenum") int param, @Ctype("ALdouble*") long values){
		try{
			alGetDoublev.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetDoublev = createCriticalMethodHandle("alGetDoublev", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static @Ctype("ALboolean") boolean alGetBoolean(@Ctype("ALenum") int param){
		try{
			return (boolean)alGetBoolean.invoke(param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBoolean = createCriticalMethodHandle("alGetBoolean", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	public static @Ctype("ALint") int alGetInteger(@Ctype("ALenum") int param){
		try{
			return (int)alGetInteger.invoke(param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetInteger = createCriticalMethodHandle("alGetInteger", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static @Ctype("ALfloat") float alGetFloat(@Ctype("ALenum") int param){
		try{
			return (float)alGetFloat.invoke(param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetFloat = createCriticalMethodHandle("alGetFloat", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));

	public static @Ctype("ALdouble") double alGetDouble(@Ctype("ALenum") int param){
		try{
			return (double)alGetDouble.invoke(param);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetDouble = createCriticalMethodHandle("alGetDouble", FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT));

	/**
	 * Error retrieval.
	 *
	 * Obtain the first error generated in the AL context since the last check.
	 */
	public static @Ctype("ALenum") int alGetError(){
		try{
			return (int)alGetError.invoke();
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetError = createCriticalMethodHandle("alGetError", FunctionDescriptor.of(ValueLayout.JAVA_INT));

	/**
	 * Extension support.
	 *
	 * Query for the presence of an extension, and obtain any appropriate function
	 * pointers and enum values.
	 */
	public static @Ctype("ALboolean") boolean alIsExtensionPresent(@Ctype("ALchar*") long extname){
		try{
			return (boolean)alIsExtensionPresent.invoke(extname);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alIsExtensionPresent = createCriticalMethodHandle("alIsExtensionPresent", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_LONG));

	public static @Ctype("void*")long alGetProcAddress(@Ctype("ALchar*") long fname){
		try{
			return (long)alGetProcAddress.invoke(fname);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetProcAddress = createCriticalMethodHandle("alGetProcAddress", FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));

	public static @Ctype("ALenum") int alGetEnumValue(@Ctype("ALchar*") long ename){
		try{
			return (int)alGetEnumValue.invoke(ename);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetEnumValue = createCriticalMethodHandle("alGetEnumValue", FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Set Listener parameters */
	public static void alListenerf(@Ctype("ALenum") int param, @Ctype("ALfloat") float value){
		try{
			alListenerf.invoke(param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListenerf = createCriticalMethodHandle("alListenerf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void alListener3f(@Ctype("ALenum") int param, @Ctype("ALfloat") float value1, @Ctype("ALfloat") float value2, @Ctype("ALfloat") float value3){
		try{
			alListener3f.invoke(param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListener3f = createCriticalMethodHandle("alListener3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void alListenerfv(@Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alListenerfv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListenerfv = createCriticalMethodHandle("alListenerfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alListeneri(@Ctype("ALenum") int param, @Ctype("ALint") int value){
		try{
			alListeneri.invoke(param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListeneri = createCriticalMethodHandle("alListeneri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alListener3i(@Ctype("ALenum") int param, @Ctype("ALint") int value1, @Ctype("ALint") int value2, @Ctype("ALint") int value3){
		try{
			alListener3i.invoke(param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListener3i = createCriticalMethodHandle("alListener3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alListeneriv(@Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alListeneriv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alListeneriv = createCriticalMethodHandle("alListeneriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Get Listener parameters */
	public static void alGetListenerf(@Ctype("ALenum") int param, @Ctype("ALfloat*") long value){
		try{
			alGetListenerf.invoke(param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListenerf = createCriticalMethodHandle("alGetListenerf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetListener3f(@Ctype("ALenum") int param, @Ctype("ALfloat*") long value1, @Ctype("ALfloat*") long value2, @Ctype("ALfloat*") long value3){
		try{
			alGetListener3f.invoke(param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListener3f = createCriticalMethodHandle("alGetListener3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetListenerfv(@Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alGetListenerfv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListenerfv = createCriticalMethodHandle("alGetListenerfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetListeneri(@Ctype("ALenum") int param, @Ctype("ALint*") long value){
		try{
			alGetListeneri.invoke(param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListeneri = createCriticalMethodHandle("alGetListeneri", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetListener3i(@Ctype("ALenum") int param, @Ctype("ALint*") long value1, @Ctype("ALint*") long value2, @Ctype("ALint*") long value3){
		try{
			alGetListener3i.invoke(param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListener3i = createCriticalMethodHandle("alGetListener3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetListeneriv(@Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alGetListeneriv.invoke(param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetListeneriv = createCriticalMethodHandle("alGetListeneriv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Create Source objects. */
	public static void alGenSources(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alGenSources.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGenSources = createCriticalMethodHandle("alGenSources", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Delete Source objects. */
	public static void alDeleteSources(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alDeleteSources.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alDeleteSources = createCriticalMethodHandle("alDeleteSources", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Verify a handle is a valid Source. */
	public static @Ctype("ALboolean") boolean alIsSource(@Ctype("ALuint") int source){
		try{
			return (boolean)alIsSource.invoke(source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alIsSource = createCriticalMethodHandle("alIsSource", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	/** Set Source parameters. */
	public static void alSourcef(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat") float value){
		try{
			alSourcef.invoke(source, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcef = createCriticalMethodHandle("alSourcef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void alSource3f(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat") float value1, @Ctype("ALfloat") float value2, @Ctype("ALfloat") float value3){
		try{
			alSource3f.invoke(source, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSource3f = createCriticalMethodHandle("alSource3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void alSourcefv(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alSourcefv.invoke(source, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcefv = createCriticalMethodHandle("alSourcefv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alSourcei(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint") int value){
		try{
			alSourcei.invoke(source, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcei = createCriticalMethodHandle("alSourcei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alSource3i(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint") int value1, @Ctype("ALint") int value2, @Ctype("ALint") int value3){
		try{
			alSource3i.invoke(source, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSource3i = createCriticalMethodHandle("alSource3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alSourceiv(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alSourceiv.invoke(source, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceiv = createCriticalMethodHandle("alSourceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Get Source parameters. */
	public static void alGetSourcef(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat*") long value){
		try{
			alGetSourcef.invoke(source, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSourcef = createCriticalMethodHandle("alGetSourcef", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetSource3f(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat*") long value1, @Ctype("ALfloat*") long value2, @Ctype("ALfloat*") long value3){
		try{
			alGetSource3f.invoke(source, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSource3f = createCriticalMethodHandle("alGetSource3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetSourcefv(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alGetSourcefv.invoke(source, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSourcefv = createCriticalMethodHandle("alGetSourcefv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetSourcei(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint*") long value){
		try{
			alGetSourcei.invoke(source, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSourcei = createCriticalMethodHandle("alGetSourcei", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetSource3i(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint*") long value1, @Ctype("ALint*") long value2, @Ctype("ALint*") long value3){
		try{
			alGetSource3i.invoke(source, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSource3i = createCriticalMethodHandle("alGetSource3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetSourceiv(@Ctype("ALuint") int source, @Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alGetSourceiv.invoke(source, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetSourceiv = createCriticalMethodHandle("alGetSourceiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Play, replay, or resume (if paused) a list of Sources */
	public static void alSourcePlayv(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alSourcePlayv.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcePlayv = createCriticalMethodHandle("alSourcePlayv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Stop a list of Sources */
	public static void alSourceStopv(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alSourceStopv.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceStopv = createCriticalMethodHandle("alSourceStopv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Rewind a list of Sources */
	public static void alSourceRewindv(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alSourceRewindv.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceRewindv = createCriticalMethodHandle("alSourceRewindv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Pause a list of Sources */
	public static void alSourcePausev(@Ctype("ALsizei") int n, @Ctype("ALuint*") long sources){
		try{
			alSourcePausev.invoke(n, sources);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcePausev = createCriticalMethodHandle("alSourcePausev", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Play, replay, or resume a Source */
	public static void alSourcePlay(@Ctype("ALuint") int source){
		try{
			alSourcePlay.invoke(source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcePlay = createCriticalMethodHandle("alSourcePlay", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	/** Stop a Source */
	public static void alSourceStop(@Ctype("ALuint") int source){
		try{
			alSourceStop.invoke(source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceStop = createCriticalMethodHandle("alSourceStop", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	/** Rewind a Source (set playback postiton to beginning) */
	public static void alSourceRewind(@Ctype("ALuint") int source){
		try{
			alSourceRewind.invoke(source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceRewind = createCriticalMethodHandle("alSourceRewind", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	/** Pause a Source */
	public static void alSourcePause(@Ctype("ALuint") int source){
		try{
			alSourcePause.invoke(source);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourcePause = createCriticalMethodHandle("alSourcePause", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));

	/** Queue buffers onto a source */
	public static void alSourceQueueBuffers(@Ctype("ALuint") int source, @Ctype("ALsizei") int nb, @Ctype("ALuint*") long buffers){
		try{
			alSourceQueueBuffers.invoke(source, nb, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceQueueBuffers = createCriticalMethodHandle("alSourceQueueBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Unqueue processed buffers from a source */
	public static void alSourceUnqueueBuffers(@Ctype("ALuint") int source, @Ctype("ALsizei") int nb, @Ctype("ALuint*") long buffers){
		try{
			alSourceUnqueueBuffers.invoke(source, nb, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alSourceUnqueueBuffers = createCriticalMethodHandle("alSourceUnqueueBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Create Buffer objects */
	public static void alGenBuffers(@Ctype("ALsizei") int n, @Ctype("ALuint*") long buffers){
		try{
			alGenBuffers.invoke(n, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGenBuffers = createCriticalMethodHandle("alGenBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Delete Buffer objects */
	public static void alDeleteBuffers(@Ctype("ALsizei") int n, @Ctype("ALuint*") long buffers){
		try{
			alDeleteBuffers.invoke(n, buffers);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alDeleteBuffers = createCriticalMethodHandle("alDeleteBuffers", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Verify a handle is a valid Buffer */
	public static @Ctype("ALboolean") boolean alIsBuffer(@Ctype("ALuint") int buffer){
		try{
			return (boolean)alIsBuffer.invoke(buffer);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alIsBuffer = createCriticalMethodHandle("alIsBuffer", FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));

	/**
	 * Overload method
	 * @see #alBufferData(int, int, long, int, int)
	 * */
	public static void alBufferData(@Ctype("ALuint") int buffer, WavData wav){
		try{
			alBufferData.invoke(buffer, ALHelpers.getFormat(wav), wav.soundData, wav.soundDatalen, wav.sampleRate);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} 
	
	/** Specifies the data to be copied into a buffer */
	public static void alBufferData(@Ctype("ALuint") int buffer, @Ctype("ALenum") int format, @Ctype("ALvoid*") long data, @Ctype("ALsizei") int size, @Ctype("ALsizei") int freq){
		try{
			alBufferData.invoke(buffer, format, data, size, freq);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBufferData = createCriticalMethodHandle("alBufferData", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	/** Set Buffer parameters, */
	public static void alBufferf(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat") float value){
		try{
			alBufferf.invoke(buffer, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBufferf = createCriticalMethodHandle("alBufferf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));

	public static void alBuffer3f(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat") float value1, @Ctype("ALfloat") float value2, @Ctype("ALfloat") float value3){
		try{
			alBuffer3f.invoke(buffer, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBuffer3f = createCriticalMethodHandle("alBuffer3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));

	public static void alBufferfv(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alBufferfv.invoke(buffer, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBufferfv = createCriticalMethodHandle("alBufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alBufferi(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint") int value){
		try{
			alBufferi.invoke(buffer, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBufferi = createCriticalMethodHandle("alBufferi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alBuffer3i(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint") int value1, @Ctype("ALint") int value2, @Ctype("ALint") int value3){
		try{
			alBuffer3i.invoke(buffer, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBuffer3i = createCriticalMethodHandle("alBuffer3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));

	public static void alBufferiv(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alBufferiv.invoke(buffer, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alBufferiv = createCriticalMethodHandle("alBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	/** Get Buffer parameters. */
	public static void alGetBufferf(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat*") long value){
		try{
			alGetBufferf.invoke(buffer, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBufferf = createCriticalMethodHandle("alGetBufferf", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetBuffer3f(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat*") long value1, @Ctype("ALfloat*") long value2, @Ctype("ALfloat*") long value3){
		try{
			alGetBuffer3f.invoke(buffer, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBuffer3f = createCriticalMethodHandle("alGetBuffer3f", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetBufferfv(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALfloat*") long values){
		try{
			alGetBufferfv.invoke(buffer, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBufferfv = createCriticalMethodHandle("alGetBufferfv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetBufferi(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint*") long value){
		try{
			alGetBufferi.invoke(buffer, param, value);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBufferi = createCriticalMethodHandle("alGetBufferi", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));

	public static void alGetBuffer3i(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint*") long value1, @Ctype("ALint*") long value2, @Ctype("ALint*") long value3){
		try{
			alGetBuffer3i.invoke(buffer, param, value1, value2, value3);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBuffer3i = createCriticalMethodHandle("alGetBuffer3i", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));

	public static void alGetBufferiv(@Ctype("ALuint") int buffer, @Ctype("ALenum") int param, @Ctype("ALint*") long values){
		try{
			alGetBufferiv.invoke(buffer, param, values);
		}catch(Throwable throwable){throw new RuntimeException(throwable);}
	} private static final MethodHandle alGetBufferiv = createCriticalMethodHandle("alGetBufferiv", FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
}
