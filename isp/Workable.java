//Problem: One big Worker interface had work(), eat(), sleep(),Robot was forced to fake eat and sleep.
//Fix: Split into small interfaces. Each class picks only what it needs.

package isp;
public interface Workable { void work(); }
