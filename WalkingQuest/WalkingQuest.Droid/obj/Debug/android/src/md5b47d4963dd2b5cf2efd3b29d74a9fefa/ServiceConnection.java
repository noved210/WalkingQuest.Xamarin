package md5b47d4963dd2b5cf2efd3b29d74a9fefa;


public class ServiceConnection
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ServiceConnection
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onServiceConnected:(Landroid/content/ComponentName;Landroid/os/IBinder;)V:GetOnServiceConnected_Landroid_content_ComponentName_Landroid_os_IBinder_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onServiceDisconnected:(Landroid/content/ComponentName;)V:GetOnServiceDisconnected_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("WalkingQuest.Droid.ServiceConnection, WalkingQuest.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ServiceConnection.class, __md_methods);
	}


	public ServiceConnection () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceConnection.class)
			mono.android.TypeManager.Activate ("WalkingQuest.Droid.ServiceConnection, WalkingQuest.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public ServiceConnection (md53c8397d2c5f6a44529f666d8ce1d96e3.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == ServiceConnection.class)
			mono.android.TypeManager.Activate ("WalkingQuest.Droid.ServiceConnection, WalkingQuest.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "WalkingQuest.Droid.Activities.MainActivity, WalkingQuest.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1)
	{
		n_onServiceConnected (p0, p1);
	}

	private native void n_onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1);


	public void onServiceDisconnected (android.content.ComponentName p0)
	{
		n_onServiceDisconnected (p0);
	}

	private native void n_onServiceDisconnected (android.content.ComponentName p0);

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
