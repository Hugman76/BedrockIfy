package me.juancarloscp52.bedrockify;

public class BedrockifySettings {
    public boolean bedrockIfyButton = true;
    public boolean showPositionHUD = true;
    public byte FPSHUD = 0;
    public byte heldItemTooltip=2;
    public boolean showPaperDoll = true;
    public boolean showChunkMap = false;
    public boolean reacharound = true;
    public boolean reacharoundSneaking = true;
    public boolean reacharoundIndicator = true;
    public boolean reacharoundMultiplayer = true;
    public int positionHUDHeight = 50;
    public int screenSafeArea = 0;
    public boolean cubeMapBackground = true;
    public boolean bedrockChat=true;
    public boolean slotHighlight = true;
    public float idleAnimation = 1;
    public boolean bedrockRecipes = true;
    public boolean savingOverlay = true;
    public boolean eatingAnimations = true;
    public boolean pickupAnimations = true;

    public boolean isEatingAnimationsEnabled() {
        return eatingAnimations;
    }
    public boolean isPickupAnimationsEnabled(){
        return pickupAnimations;
    }
    public boolean isCubemapBackgroundEnabled() {
        return cubeMapBackground;
    }

    public boolean isShowPositionHUDEnabled() {
        return showPositionHUD;
    }

    public byte getHeldItemTooltip(){
        return this.heldItemTooltip;
    }

    public byte getFPSHUDoption() {
        return FPSHUD;
    }

    public boolean isShowPaperDollEnabled() {
        return showPaperDoll;
    }

    public boolean isReacharoundMultiplayerEnabled() {
        return reacharoundMultiplayer;
    }

    public boolean isReacharoundIndicatorEnabled() {
        return reacharoundIndicator;
    }

    public boolean isShowChunkMapEnabled() {
        return showChunkMap;
    }

    public boolean isBedrockRecipesEnabled() {
        return bedrockRecipes;
    }


    public boolean isBedrockIfyButtonEnabled() {
        return bedrockIfyButton;
    }

    public boolean isSavingOverlayEnabled() {
        return savingOverlay;
    }


    public int getPositionHUDHeight() {
        if (positionHUDHeight > 100)
            positionHUDHeight = 100;
        return positionHUDHeight;
    }

    public int getScreenSafeArea() {
        if (screenSafeArea > 30)
            screenSafeArea = 30;
        return screenSafeArea;
    }

    public float getIdleAnimation(){
        return idleAnimation;
    }

    public boolean isReacharoundEnabled() {
        return reacharound;
    }

    public boolean isReacharoundSneakingEnabled() {
        return reacharoundSneaking;
    }


    public boolean isBedrockChatEnabled() {
        return bedrockChat;
    }

    public boolean isSlotHighlightEnabled() {
        return slotHighlight;
    }
}
