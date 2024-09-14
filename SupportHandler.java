public abstract class SupportHandler {
    protected SupportHandler nextSupportHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextSupportHandler = nextHandler;
    }
    public abstract void handleRequest(SupportType supportType);

    protected void outputNotFoundMessage(SupportType supportType) {
        System.out.println(supportType.name() + "このお問合わせは対応できません。");
    }
}