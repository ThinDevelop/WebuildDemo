package com.tss.webuilddemo

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.sunmi.peripheral.printer.InnerResultCallbcak
import com.sunmi.peripheral.printer.SunmiPrinterService
import com.tss.webuilddemo.app.MyApplication
import kotlinx.android.synthetic.main.activity_bbbbb.*

class BbbbbActivity : AppCompatActivity() {
    var bitmap: Bitmap? = null
    private var sunmiPrinterService: SunmiPrinterService? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbbbb)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        sunmiPrinterService = MyApplication.sunmiPrinterService
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img_print10)
        btn_back.setOnClickListener {
            startActivity(Intent(this@BbbbbActivity, BbbbbbActivity::class.java))
            this@BbbbbActivity.finish()
        }
        btn_next.setOnClickListener {
            gray.visibility = View.VISIBLE
            clickPrint()
        }
        btn_done.setOnClickListener {
            startActivity(Intent(this@BbbbbActivity, MainMenuActivity::class.java))
            this@BbbbbActivity.finish()
        }
    }

    fun clickPrint() {
        try {
            val text = "\n\nวันที่ ......... เลขที่ ..........\n" + "\n" + "\n" + "บันทึกการยึดใบอนุญาตขับขี่ด้วยวิธี\n" + "การทางอิเล็กทรอนิกส์เป็นการชั่วคราว\n" + "ตามพระราชบัญญัติจราจรทางบก \n" + "พ.ศ.๒๕๒๒ มาตรา ๑๔๐/๒\n" + "\n" + "\n" + "หน่วยงาน .....................\n" + "\n" + "\n" + "ชื่อ-สกุล ......................\n" + "เลขประจำตัว ..................\n" + "ประเภทใบอนญาต ...............\n" + "เลขที่ใบอนุญาต .................\n" + "จังหวัด .......................\n" + "\n" + "\n" + "ทะเบียนรถ ....................\n" + "จังหวัด .......................\n" + "ประเภทรถ ....................\n" + "ยี่ห้อ .........................\n" + "\n" + "\n" + "ได้กระทำผิดฐาน\n" + "๑. ..........................\n" + "๒. ..........................\n" + "๓. ..........................\n" + "วันเวลาที่เกิดเหตุ ................\n" + "สถานที่เกิดเหตุ ..................\n" + "ตำบล/แขวง ....................\n" + "อำเภอ/เขต ....................\n" + "จังหวัด ........................\n" + "\n" + "\n" + "   เจ้าพนักงานจราจร พิจารณาแล้ว\n" + "เห็นว่าผู้ขับขี่อยู่ในสภาพที่หากให้ขับ\n" + "รถต่อไปอาจเป็นอันตรายต่อชีวิต\n" + "ร่างกาย หรือทรัพย์สินของตนเองหรือ\n" + "ผู้อื่น อาศัยอำนาจตามพระราชบัญญัติ\n" + "จราจรทางบก พ.ศ. ๒๕๒๒ \n" + "มาตรา ๑๔๐/๒ จึงบันทึก\n" + "การยึดใบอนุญาตขับขี่ด้วยวิธีการทาง\n" + "อิเล็กทรอนิกส์ของผู้ขับขี่ไว้ตั้งแต่\n" + "วันที่ .... เดือน ...... พ.ศ. ....\n" + "เวลา .... น. เป็นต้นไป จนกว่าผู้\n" + "ขับขี่จะอยู่ในสภาพที่จะสามารถขับรถ\n" + "ต่อไปได้หรือเมื่อเจ้าพนักงานจราจร\n" + "แน่ใจผู้ขับขี่จะไม่ขับรถในขณะที่อยู่\n" + "ในสภาพดังกล่าว\n" + "\n" + "\n" + "ลงชื่อผู้จับกุม .......รหัส ........\n" + "     (                    )\n" + "ลงชื่อผู้กระทำผิด ................\n" + "\n" + "\n" + "โปรดนำเอกสารนี้มาแสดงต่อ\n" + "เจ้าพนักงานจราจรเมื่อจะขอรับ\nใบอนุญาตขับขี่คืน\n\n\n"

            sunmiPrinterService!!.enterPrinterBuffer(true)
            sunmiPrinterService!!.printText(text, innerResultCallbcak)
            sunmiPrinterService!!.printText("\n\n", innerResultCallbcak)
            sunmiPrinterService!!.exitPrinterBufferWithCallback(true, innerResultCallbcak)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun clickPrint2() {
        try {
            val text = "\n\nวันที่ ......... เลขที่ ..........\n" + "\n" + "\n" + "บันทึกการยึดใบอนุญาตขับขี่ด้วยวิธี\n" + "การทางอิเล็กทรอนิกส์เป็นการชั่วคราว\n" + "ตามพระราชบัญญัติจราจรทางบก \n" + "พ.ศ.๒๕๒๒ มาตรา ๑๔๐/๒\n" + "\n" + "\n" + "หน่วยงาน .....................\n" + "\n" + "\n" + "ชื่อ-สกุล ......................\n" + "เลขประจำตัว ..................\n" + "ประเภทใบอนญาต ...............\n" + "เลขที่ใบอนุญาต .................\n" + "จังหวัด .......................\n" + "\n" + "\n" + "ทะเบียนรถ ....................\n" + "จังหวัด .......................\n" + "ประเภทรถ ....................\n" + "ยี่ห้อ .........................\n" + "\n" + "\n" + "ได้กระทำผิดฐาน\n" + "๑. ..........................\n" + "๒. ..........................\n" + "๓. ..........................\n" + "วันเวลาที่เกิดเหตุ ................\n" + "สถานที่เกิดเหตุ ..................\n" + "ตำบล/แขวง ....................\n" + "อำเภอ/เขต ....................\n" + "จังหวัด ........................\n" + "\n" + "\n" + "   เจ้าพนักงานจราจร พิจารณาแล้ว\n" + "เห็นว่าผู้ขับขี่อยู่ในสภาพที่หากให้ขับ\n" + "รถต่อไปอาจเป็นอันตรายต่อชีวิต\n" + "ร่างกาย หรือทรัพย์สินของตนเองหรือ\n" + "ผู้อื่น อาศัยอำนาจตามพระราชบัญญัติ\n" + "จราจรทางบก พ.ศ. ๒๕๒๒ \n" + "มาตรา ๑๔๐/๒ จึงบันทึก\n" + "การยึดใบอนุญาตขับขี่ด้วยวิธีการทาง\n" + "อิเล็กทรอนิกส์ของผู้ขับขี่ไว้ตั้งแต่\n" + "วันที่ .... เดือน ...... พ.ศ. ....\n" + "เวลา .... น. เป็นต้นไป จนกว่าผู้\n" + "ขับขี่จะอยู่ในสภาพที่จะสามารถขับรถ\n" + "ต่อไปได้หรือเมื่อเจ้าพนักงานจราจร\n" + "แน่ใจผู้ขับขี่จะไม่ขับรถในขณะที่อยู่\n" + "ในสภาพดังกล่าว\n" + "\n" + "\n" + "ลงชื่อผู้จับกุม .......รหัส ........\n" + "     (                    )\n" + "ลงชื่อผู้กระทำผิด ................\n" + "\n" + "\n" + "โปรดนำเอกสารนี้มาแสดงต่อ\n" + "เจ้าพนักงานจราจรเมื่อจะขอรับ\nใบอนุญาตขับขี่คืน\n\n\n"

            sunmiPrinterService!!.printBitmap(bitmap, innerResultCallbcak)
            sunmiPrinterService!!.lineWrap(6, innerResultCallbcak)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    var b = true
    val innerResultCallbcak: InnerResultCallbcak = object : InnerResultCallbcak() {
        override fun onRunResult(isSuccess: Boolean) {
            Log.e("lxy1", "result:$isSuccess")
            if (b) {
                clickPrint2()
                b = false
            }

        }

        override fun onReturnString(result: String) {
            Log.e("lxy", "result:$result")
        }

        override fun onRaiseException(code: Int, msg: String) {
            Log.e("lxy", "code:$code,msg:$msg")
        }

        override fun onPrintResult(code: Int, msg: String) {
            Log.e("lxy", "code:$code,msg:$msg")
        }
    }
}