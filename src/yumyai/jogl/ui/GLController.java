/*
 * This file is part of Wakame, a Java reimplementation of Nori, an educational ray tracer by Wenzel Jakob.
 *
 * Copyright (c) 2015 by Pramook Khungurn
 *
 * Wakame is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License Version 3
 * as published by the Free Software Foundation.
 *
 * Wakame is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package yumyai.jogl.ui;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.media.opengl.GLEventListener;

public interface GLController
        extends GLEventListener,
        MouseListener,
        MouseMotionListener,
        KeyListener
{
    // NO-OP
}
