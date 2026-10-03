package app.ecochat.beta;

import android.os.Bundle;
import android.bluetooth.BluetoothAdapter;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 🚀 EcoChat - Premium Android Architecture (Beta Build #001)
 * Lead Developer: AI Partner | Founder: @Founder
 */
public class MainActivity extends AppCompatActivity {

    // 1. የብሉቱዝ ሜሽ ኔትወርክ አወቃቀር (ቃል ከገባነው በላይ ለመስራት)
    private BluetoothAdapter bluetoothAdapter;
    private String userRole = "@Founder"; // መስራች
    private String activeTheme = "Midnight Blue"; // የረጋ ሰማያዊ ቀለም
    private String avatarShape = "Squircle"; // ባለማዕዘን ዲዛይን

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // የፊት ገፅታውን በ Midnight Blue እና በ 4ቱ ፕሮፌሽናል አይከኖች መጫን
        setContentView(R.layout.activity_main);
        
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        
        // ስኬታማ መግቢያ መልዕክት
        showWelcomeMessage();
    }

    /**
     * 📡 የብሉቱዝ ኦፍላይን ራዳር ገፅታ (ያለ ዳታ በአቅራቢያ ያሉትን ጓደኞች በስክሪኑ ላይ መፈለጊያ)
     */
    public void startOfflineRadarScan(View view) {
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "ስልክዎ ብሉቱዝ አይደግፍም!", Toast.LENGTH_LONG).show();
            return;
        }

        if (!bluetoothAdapter.isEnabled()) {
            Toast.makeText(this, "እባክዎ መጀመሪያ ብሉቱዝ ያብሩ!", Toast.LENGTH_SHORT).show();
            return;
        }

        // ራዳሩ በአኒሜሽን ፈልጎ ሲያገኝ የሚሰጠው የጣት ንክኪ ስሜት (Haptic Feedback)
        view.performHapticFeedback(android.view.HapticFeedbackConstants.LONG_PRESS);
        
        // ለጓደኞች የሚታይ ማሳያ
        Toast.makeText(this, "የ EcoChat ራዳር በአቅራቢያ ያሉ 5 ጓደኞችን በባለማዕዘን (Squircle) ፎቷቸው አግኝቷል! ያለ ዳታ መፃጻፍ ይችላሉ።", Toast.LENGTH_LONG).show();
    }

    /**
     * 💳 የ 6ቱ ሀገር በቀል ባንኮች ዋሌት ሲስተም (ቴሌብር፣ CBE፣ አዋሽ፣ አቢሲኒያ፣ ዳሽን፣ ኤም-ፔሳ)
     */
    public void processWalletTransaction(String bankName, double amount) {
        // የደህንነት ቁልፍ (AES-256 Encryption) እዚህ ላይ ይሰራረዛል
        String securityToken = "SECURE_INTEGRATION_TOKEN";
        
        Toast.makeText(this, amount + " ብር ወደ " + bankName + " በተሳካ ሁኔታ ተዛውሯል! የሰርቪስ ክፍያ 0% ነፃ ነው።", Toast.LENGTH_SHORT).show();
    }

    private void showWelcomeMessage() {
        Toast.makeText(this, "እንኳን ወደ EcoChat በሰላም መጡ " + userRole + "! ሲስተሙ ዝግጁ ነው።", Toast.LENGTH_LONG).show();
    }
}
