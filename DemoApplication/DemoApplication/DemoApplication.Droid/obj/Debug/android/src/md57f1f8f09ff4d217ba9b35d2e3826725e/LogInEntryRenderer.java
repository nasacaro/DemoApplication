package md57f1f8f09ff4d217ba9b35d2e3826725e;


public class LogInEntryRenderer
	extends md5b60ffeb829f638581ab2bb9b1a7f4f3f.EntryRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("DemoApplication.Droid.Renderer.LogInEntryRenderer, DemoApplication.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", LogInEntryRenderer.class, __md_methods);
	}


	public LogInEntryRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LogInEntryRenderer.class)
			mono.android.TypeManager.Activate ("DemoApplication.Droid.Renderer.LogInEntryRenderer, DemoApplication.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public LogInEntryRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == LogInEntryRenderer.class)
			mono.android.TypeManager.Activate ("DemoApplication.Droid.Renderer.LogInEntryRenderer, DemoApplication.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public LogInEntryRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == LogInEntryRenderer.class)
			mono.android.TypeManager.Activate ("DemoApplication.Droid.Renderer.LogInEntryRenderer, DemoApplication.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}