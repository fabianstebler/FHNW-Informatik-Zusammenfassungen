package webfr.simple.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class WelcomeView extends Composite implements WelcomeDisplay {

	private static WelcomeViewUiBinder uiBinder = GWT
			.create(WelcomeViewUiBinder.class);

	interface WelcomeViewUiBinder extends UiBinder<Widget, WelcomeView> {
	}

	public WelcomeView() {
		initWidget(uiBinder.createAndBindUi(this));
		one.setText("1");
		two.setText("2");
	}

	@UiField
	Button one;
	@UiField
	Button two;
	
	private ClickHandler oneclick;

	@UiHandler("one")
	void onClick(ClickEvent e) {
		oneclick.onClick(e);
	}

	@Override
	public void setOneButtonHandler(ClickHandler handler) {
		oneclick = handler;
	}

	@Override
	public void setTwoButtonHandler(ClickHandler handler) {
		// TODO Auto-generated method stub
		
	}

}
