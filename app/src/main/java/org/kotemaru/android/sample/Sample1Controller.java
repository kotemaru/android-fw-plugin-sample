package org.kotemaru.android.sample;

import org.kotemaru.android.delegatehandler.annotation.DelegateHandler;
import org.kotemaru.android.delegatehandler.annotation.Handle;
import org.kotemaru.android.delegatehandler.rt.ThreadManager;

@DelegateHandler
public class Sample1Controller{

	@Handle(thread = ThreadManager.WORKER)
	public void openAlertDialog() {
	}

}
