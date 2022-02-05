package changhwan.experiment.animationtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import changhwan.experiment.animationtest.databinding.ActivityMainBinding
import com.spark.android.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}