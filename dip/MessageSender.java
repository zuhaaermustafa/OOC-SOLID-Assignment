// Problem: NotificationService directly created an EmailSender inside itself — hard to swap or test.
// Fix: Use a MessageSender interface. Pass in any sender from outside.

package dip;
public interface MessageSender { void send(String msg); }
