/*
 * Minecraft Forge
 * Copyright (c) 2016-2021.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.client.event;

import net.minecraft.client.gui.toasts.IToast;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;

/**
 * Fired whenever the client is about to queue up a toast message to be rendered on-screen.
 * Canceling the event will prevent the toast from being rendered.
 */
@Cancelable
public class ToastAddEvent extends Event
{
    private final IToast toast;

    public ToastAddEvent(IToast toast)
    {
        this.toast = toast;
    }

    /**
     * @return the toast that will be rendered on-screen
     */
    public IToast getToast()
    {
        return toast;
    }
}
