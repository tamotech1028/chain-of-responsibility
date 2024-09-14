// システムの復旧をするサポート
public class SystemOutageSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportType supportType) {
        if (supportType.equals(SupportType.SYSTEM_OUTAGE)) {
            System.out.println("システムが異常停止したため復旧します");
        } else if (nextSupportHandler != null) {
            System.out.println("こちらはシステム課です。別の部署に問い合わせます");
            nextSupportHandler.handleRequest(supportType);
        } else {
            super.outputNotFoundMessage(supportType);
        }
    }
}
