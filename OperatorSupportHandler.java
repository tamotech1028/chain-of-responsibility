// 総合窓口（オペレーションセンター）
public class OperatorSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportType supportType) {
        System.out.println("こちらオペレーションセンターです。お問合せ内容を確認します");
        nextSupportHandler.handleRequest(supportType);
    }
}
