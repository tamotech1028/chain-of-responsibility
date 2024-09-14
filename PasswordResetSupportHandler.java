// パスワードのリセットを担うサポート
public class PasswordResetSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportType supportType) {
        if (supportType.equals(SupportType.PASSWORD_RESET)) {
            System.out.println("パスワードのリセットを行います");
        } else if (nextSupportHandler != null) {
            System.out.println("こちらは個人情報管理課です。別の部署に問い合わせます");
            nextSupportHandler.handleRequest(supportType);
        } else {
            super.outputNotFoundMessage(supportType);
        }
    }
}
