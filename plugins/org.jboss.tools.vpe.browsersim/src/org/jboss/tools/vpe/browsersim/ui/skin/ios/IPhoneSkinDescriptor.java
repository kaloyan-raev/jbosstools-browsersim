package org.jboss.tools.vpe.browsersim.ui.skin.ios;

import org.jboss.tools.vpe.browsersim.ui.skin.ImageDescriptor;

public class IPhoneSkinDescriptor {
	private int bodyGridSize;
	private ImageDescriptor[] bodyGridImageDescriptors;
	private ImageDescriptor iOSDescriptor;
	private ButtonDescriptor backButton;
	private ButtonDescriptor forwardButton;

	public IPhoneSkinDescriptor(int bodyGridSize,
			ImageDescriptor[] bodyGridImageDescriptors,
			ImageDescriptor iOSDescriptor, ButtonDescriptor backButton,
			ButtonDescriptor forwardButton) {
		this.bodyGridSize = bodyGridSize;
		this.bodyGridImageDescriptors = bodyGridImageDescriptors;
		this.iOSDescriptor = iOSDescriptor;
		this.backButton = backButton;
		this.forwardButton = forwardButton;
	}

	public int getBodyGridSize() {
		return bodyGridSize;
	}

	public ImageDescriptor[] getBodyGridImageDescriptors() {
		return bodyGridImageDescriptors;
	}

	public ImageDescriptor getiOSDescriptor() {
		return iOSDescriptor;
	}

	public ButtonDescriptor getBackButton() {
		return backButton;
	}

	public ButtonDescriptor getForwardButton() {
		return forwardButton;
	}
}
