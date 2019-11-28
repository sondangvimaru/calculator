package com.cnt57cl.kiemtra

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    var biendau:Long?=0
    var biensau:Long?=0
    var result_match:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dangky()
    }

    fun dangky()
    {
        number_0.setOnClickListener(this)
        number_1.setOnClickListener(this)
        number_2.setOnClickListener(this)
        number_3.setOnClickListener(this)
        number_4.setOnClickListener(this)
        number_5.setOnClickListener(this)
        number_6.setOnClickListener(this)
        number_7.setOnClickListener(this)
        number_8.setOnClickListener(this)
        number_9.setOnClickListener(this)
        btn_cong.setOnClickListener(this)
        btn_tru.setOnClickListener(this)
        btn_nhan.setOnClickListener(this)
        btn_chia.setOnClickListener(this)
        btn_bang.setOnClickListener(this)
        number_xoa.setOnClickListener(this)
        number_xoahet.setOnClickListener(this)
    }
    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        when(v?.id)
        {
            R.id.number_1->
            {
               tv_number.append((1).toString())
            }
            R.id.number_2->
            {
                tv_number.append((2).toString())
            }
            R.id.number_3->
            {
                tv_number.append((3).toString())
            }
            R.id.number_4->
            {
                tv_number.append((4).toString())
            }
            R.id.number_5->
            {
                tv_number.append((5).toString())
            }
            R.id.number_6->
            {
                tv_number.append((6).toString())
            }
            R.id.number_7->
            {
                tv_number.append((7).toString())
            }
            R.id.number_8->
            {
                tv_number.append((8).toString())
            }
            R.id.number_9->
            {
                tv_number.append((9).toString())
            }
            R.id.number_0->
            {
                tv_number.append((0).toString())
            }
            R.id.btn_cong->
            {
                if(biendau ==(0).toLong() && biensau==(0).toLong()) {
                    biendau = tv_number.text.toString().toLong()

                    tv_number.append(resources.getString(R.string.cong))
                }
                else if(biendau!=(0).toLong() && biensau==(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.tru))
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-","+")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*","+")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","+")
                        tv_number.text=t
                    }
                    else
                    {

                        biensau=getso2("+")
                        if(biensau!=(0).toLong()) {
                            result_match = biendau!! + biensau!!
                            tv_number.text =
                                result_match.toString() + resources.getString(R.string.cong)

                        }
                    }

                }
                else if(biendau!=(0).toLong() && biensau!=(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.tru))
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-","+")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*","+")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","+")
                        tv_number.text=t
                    }
                        biendau=getso1("+")
                        biensau=getso2("+")
                        result_match= biendau!!+ biensau!!
                    if(biendau!=(0).toLong() && biensau!=(0).toLong())
                        tv_number.text=result_match.toString()+resources.getString(R.string.cong)



                }
            }
            R.id.btn_tru->
            {
                if(biendau ==(0).toLong() && biensau==(0).toLong()) {
                    biendau = tv_number.text.toString().toLong()

                    tv_number.append(resources.getString(R.string.tru))
                }
                else if(biendau!=(0).toLong() && biensau==(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.tru))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                       val t=tv_number.text.toString().replace("+","-")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*","-")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","-")
                        tv_number.text=t
                    }
                    else
                    {

                            biensau = getso2("-")
                        if(biensau!=(0).toLong()) {
                            result_match = biendau!! - biensau!!
                            tv_number.text =
                                result_match.toString() + resources.getString(R.string.tru)

                        }
                    }

                }
                else if(biendau!=(0).toLong() && biensau!=(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.tru))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("+","-")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*","-")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","-")
                        tv_number.text=t
                    }
                    biendau=getso1("-")
                    biensau=getso2("-")
                    result_match= biendau!!- biensau!!
                    if(biendau!=(0).toLong() && biensau!=(0).toLong())
                    tv_number.text=result_match.toString()+resources.getString(R.string.tru)




                }
            }
            R.id.btn_nhan->
            {
                if(biendau ==(0).toLong() && biensau==(0).toLong()) {
                    biendau = tv_number.text.toString().toLong()

                    tv_number.append(resources.getString(R.string.nhan))
                }
                else if(biendau!=(0).toLong() && biensau==(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.nhan))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("+","*")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-","*")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","*")
                        tv_number.text=t
                    }
                    else
                    {

                        biensau=getso2("x")
                        if(biensau!=(0).toLong()) {
                            result_match = biendau!! * biensau!!
                            tv_number.text =
                                result_match.toString() + resources.getString(R.string.nhan)

                        }
                    }

                }
                else if(biendau!=(0).toLong() && biensau!=(0).toLong())
                {

                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.nhan))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("+","*")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-","*")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf(":",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace(":","*")
                        tv_number.text=t
                    }
                    biendau=getso1("x")
                    biensau=getso2("x")
                    result_match= biendau!!* biensau!!
                    if(biendau!=(0).toLong() && biensau!=(0).toLong())
                    tv_number.text=result_match.toString()+resources.getString(R.string.nhan)




                }
            }
            R.id.btn_chia->
            {
                if(biendau ==(0).toLong() && biensau==(0).toLong()) {
                    biendau = tv_number.text.toString().toLong()

                    tv_number.append(resources.getString(R.string.chia))
                }
                else if(biendau!=(0).toLong() && biensau==(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.chia))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("+",":")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-",":")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*",":")
                        tv_number.text=t
                    }
                    else
                    {

                        biensau=getso2(":")
                        if(biensau!=(0).toLong()) {
                            result_match = biendau!! / biensau!!
                            tv_number.text =
                                result_match.toString() + resources.getString(R.string.chia)

                        }
                    }

                }
                else if(biendau!=(0).toLong() && biensau!=(0).toLong())
                {
                    if(tv_number.text.trim().indexOf("-",0,false)<0 &&tv_number.text.trim().indexOf("+",0,false)<0&&tv_number.text.trim().indexOf("*",0,false)<0
                        &&  tv_number.text.trim().indexOf(":",0,false)<0
                    ) {
                        tv_number.append(resources.getString(R.string.chia))
                    }
                    else if(tv_number.text.trim().indexOf("+",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("+",":")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("-",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("-",":")
                        tv_number.text=t
                    }
                    else if(tv_number.text.trim().indexOf("*",0,false)>0)
                    {
                        val t=tv_number.text.toString().replace("*",":")
                        tv_number.text=t
                    }
                    biendau=getso1(":")
                    biensau=getso2(":")

                    if(biendau!=(0).toLong() && biensau!=(0).toLong())
                        result_match= biendau!!/ biensau!!
                    tv_number.text=result_match.toString()+resources.getString(R.string.chia)




                }
            }

            R.id.number_xoa->
            {

                val t= removeLastChar(tv_number.text.trim().toString())
                tv_number.text=t
            }
            R.id.number_xoahet->
            {

                biendau=0
                biensau=0
                tv_number.text=""
            }
            R.id.btn_bang->
            {


                    if(tv_number.text.toString().trim().indexOf("+")>0)
                    {
                        biendau=getso1("+")
                        biensau=getso2("+")
                        if(biendau!=(0).toLong() && biensau!=(0).toLong())
                        tv_number.text=(biendau!!+biensau!!).toString()
                    }else

                        if(tv_number.text.toString().trim().indexOf("-")>0)
                        {
                            biendau=getso1("-")
                            biensau=getso2("-")
                            if(biendau!=(0).toLong() && biensau!=(0).toLong()) {
                                tv_number.text = (biendau!! - biensau!!).toString()
                              biendau=0
                                biensau=0
                            }

                        }else
                            if(tv_number.text.toString().trim().indexOf("x")>0)
                            {
                                biendau=getso1("x")
                                biensau=getso2("x")
                                if(biendau!=(0).toLong() && biensau!=(0).toLong()) {
                                    tv_number.text = (biendau!! * biensau!!).toString()
                                    biendau=0
                                    biensau=0
                                }
                            }else

                                if(tv_number.text.toString().trim().indexOf(":")>0)
                                {
                                    biendau=getso1(":")
                                    biensau=getso2(":")
                                    if(biendau!=(0).toLong() && biensau!=(0).toLong())
                                    {
                                        tv_number.text=(biendau!!/biensau!!).toString()
                                        biendau=0
                                        biensau=0
                                    }

                                }

            }
        }

    }
    private fun removeLastChar(str: String): String? {
        return str.substring(0, str.length - 1)
    }
    fun getso1(kytu: String):Long
    {

        val text=tv_number.text
        val arr= text.toString().toCharArray()
        var result=" "

        for(i in 0 until arr.size)
        {
            if(arr[i].toString()==kytu)
            {
               break
            }
            else
            {
                result+=arr[i]
            }

        }

        if(result!=" ")
    return result.trim().toLong()
    else return  0
    }

fun  getso2(kytu:String):Long
{
    val text=tv_number.text
    val arr= text.toString().toCharArray()
    var result=" "
    var check =0
    for(i in 0 until arr.size)
    {
        if(arr[i].toString()==kytu)
        {
            check=1
        }
        else if(check==1)
        {

            result+=arr[i]
        }
    }
    if(result!=" ")
    return result.trim().toLong()
    else return  0
}

}
