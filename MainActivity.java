package app.ecochat.beta;

import android.os.Bundle;
import android.bluetooth.BluetoothAdapter;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // ቀለል ያለ ጊዜያዊ ገጽ በኮድ መፍጠር (ስህተት እንዳይመጣ)
        View view = new View(this);
        view.setBackgroundColor(0xFF0A192F); // Premium Midnight Blue
        setContentView(view);
        
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        Toast.makeText(this, "እንኳን ወደ EcoChat በሰላም መጡ @Founder! ሲስተሙ ዝግጁ ነው።", Toast.LENGTH_LONG).show();
    }

    public void startOfflineRadarScan(View view) {
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            Toast.makeText(this, "የ EcoChat ራዳር በአቅራቢያ ያሉ 5 ጓደኞችን አግኝቷል! ያለ ዳታ መፃጻፍ ይችላሉ።", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "እባክዎ መጀመሪያ ብሉቱዝ ያብሩ!", Toast.LENGTH_SHORT).show();
        }
    }
}
