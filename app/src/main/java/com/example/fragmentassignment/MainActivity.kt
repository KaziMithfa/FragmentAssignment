package com.example.fragmentassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentassignment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val fragment = FirstFragment()
        val x ="A is a Capital  Alphabet letter"
        val bundle = Bundle()
        bundle.putString("name",x)
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()



      binding.ButtonA.setOnClickListener{


          val fragment = FirstFragment()
          val x = binding.ButtonA.text.toString()
          val bundle = Bundle()
          bundle.putString("name","$x is a Capital Alphabet  letter")
          fragment.arguments = bundle

          supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
      }


        binding.ButtonB.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonB.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet  letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonC.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonC.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet  letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonD.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonD.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet  letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonE.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonE.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }


        binding.ButtonF.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonF.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }


        binding.ButtonG.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonG.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonH.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonH.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonI.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonI.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonJ.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonJ.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonK.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonK.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonI.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonI.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonJ.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonJ.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonK.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonK.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonL.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonL.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonM.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonM.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonN.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonN.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonO.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonO.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonP.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonP.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonQ.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonQ.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonR.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonR.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonS.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonS.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }


        binding.ButtonT.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonT.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonU.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonU.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonV.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonV.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonW.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonW.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonX.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonX.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonY.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonY.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }

        binding.ButtonZ.setOnClickListener{


            val fragment = FirstFragment()
            val x = binding.ButtonZ.text.toString()
            val bundle = Bundle()
            bundle.putString("name","$x is a Capital Alphabet letter")
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
        }






    }
}