package changhwan.experiment.animationtest

import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import changhwan.experiment.animationtest.databinding.ActivityMainBinding
import com.spark.android.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            initAnimation()
        },2000)

    }

    fun initAnimation(){
        val animationColorChange = AnimatorInflater.loadAnimator(this, R.animator.object_ani_test).apply{
            setTarget(binding.tvAnimationText)
            start()
        }


    }
}