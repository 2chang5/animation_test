package changhwan.experiment.animationtest

import android.animation.Animator
import android.animation.AnimatorInflater
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationSet
import android.widget.Toast
import androidx.core.animation.doOnEnd
import androidx.core.animation.doOnStart
import changhwan.experiment.animationtest.databinding.ActivityMainBinding
import com.spark.android.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAnimation()

    }

//    fun initAnimation() {
//        binding.btnAnimationStart.setOnClickListener {
//            val animationColorChange =
//                AnimatorInflater.loadAnimator(this, R.animator.object_ani_test5).apply {
//                    addListener(object : AnimatorListenerAdapter(){
//                        override fun onAnimationStart(animation: Animator?) {
//                            super.onAnimationStart(animation)
//                            Toast.makeText(this@MainActivity,"시작확인",Toast.LENGTH_SHORT).show()
//                        }
//
//                        override fun onAnimationEnd(animation: Animator?) {
//                            super.onAnimationEnd(animation)
//                            Toast.makeText(this@MainActivity,"끝확인",Toast.LENGTH_SHORT).show()
//                        }
//                    })
//
//                    setTarget(binding.tvAnimationText)
//                    start()
//                }
//        }
//    }

//    fun initAnimation() {
//        binding.btnAnimationStart.setOnClickListener {
//            val animationColorChange =
//                AnimatorInflater.loadAnimator(this, R.animator.object_ani_test5).apply {
//                    doOnStart { Toast.makeText(this@MainActivity, "시작", Toast.LENGTH_SHORT).show() }
//                    doOnEnd { Toast.makeText(this@MainActivity,"끝",Toast.LENGTH_SHORT).show() }
//                    setTarget(binding.tvAnimationText)
//                    start()
//                }
//        }
//    }

    fun initAnimation() {
        binding.btnAnimationStart.setOnClickListener {
            val animationColorChange =
                AnimatorInflater.loadAnimator(this, R.animator.object_ani_test5).apply {
                    doOnStart { Toast.makeText(this@MainActivity, "시작", Toast.LENGTH_SHORT).show() }
                    doOnEnd { Toast.makeText(this@MainActivity, "끝", Toast.LENGTH_SHORT).show() }
                    setTarget(binding.tvAnimationText)
                }

            val animationButtonChange =
                AnimatorInflater.loadAnimator(this, R.animator.object_ani_test4).apply {
                    setTarget(binding.btnAnimationStart)
                }


            val animationTestForSet =
                AnimatorInflater.loadAnimator(this,R.animator.object_ani_test).apply {
                    setTarget(binding.view)
                }

            val firstAnimation = AnimatorSet().apply {
                play(animationColorChange).after(2000).before(animationButtonChange)
            }

            AnimatorSet().apply{
                play(firstAnimation).with(animationTestForSet)
                start()
            }

        }
    }
}
