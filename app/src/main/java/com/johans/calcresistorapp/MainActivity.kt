package com.johans.calcresistorapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.blue
import android.graphics.Color.parseColor
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val SPACE = "   "
        private const val SPACE_SIMPLE = " "
        private const val SIM_OH = "Ω"
        private const val SIM_kOH = "KΩ"
        private const val SIM_MOH = "MΩ"
    }

    private var ban1 = "1"
    private var ban2 = "0"
    private var ban3: Double = 1.0
    private var ban4 = "+-1%"

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ban1_marron_btn.setOnClickListener { color_banda1("#804000","1")
            Toast.makeText(this,getString(R.string.marron), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_rojo_btn.setOnClickListener { color_banda1("#A50C0C","2")
            Toast.makeText(this,getString(R.string.rojo),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_naranja_btn.setOnClickListener { color_banda1("#FF8000","3")
            Toast.makeText(this,getString(R.string.naranja),Toast.LENGTH_SHORT).show();Toast.makeText(this,getString(R.string.rojo),Toast.LENGTH_LONG).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_amarillo_btn.setOnClickListener { color_banda1("#FFEB3B","4")
            Toast.makeText(this,getString(R.string.amarillo),Toast.LENGTH_SHORT).show();
             val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_verde_btn.setOnClickListener { color_banda1("#71F176","5")
            Toast.makeText(this,getString(R.string.verde),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_azul_btn.setOnClickListener { color_banda1("#3F51B5","6")
            Toast.makeText(this,getString(R.string.azul),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_violeta_btn.setOnClickListener { color_banda1("#B838CD","7")
            Toast.makeText(this,getString(R.string.violeta),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_gris_btn.setOnClickListener { color_banda1("#636363","8")
            Toast.makeText(this,getString(R.string.gris),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban1_blanco_btn.setOnClickListener { color_banda1("#E8E4E4","9")
            Toast.makeText(this,getString(R.string.blanco),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }

        ban2_negro_btn.setOnClickListener { color_banda2("#000000", "0")
            Toast.makeText(this,getString(R.string.negro),Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_marron_btn.setOnClickListener { color_banda2("#804000","1")
            Toast.makeText(this,getString(R.string.marron), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_rojo_btn.setOnClickListener { color_banda2("#A50C0C","2")
            Toast.makeText(this,getString(R.string.rojo), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_naranja_btn.setOnClickListener { color_banda2("#FF8000","3")
            Toast.makeText(this,getString(R.string.naranja), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_amarillo_btn.setOnClickListener { color_banda2("#FFEB3B","4")
            Toast.makeText(this,getString(R.string.amarillo), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_verde_btn.setOnClickListener { color_banda2("#71F176","5")
            Toast.makeText(this,getString(R.string.verde), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_azul_btn.setOnClickListener { color_banda2("#3F51B5","6")
            Toast.makeText(this,getString(R.string.azul), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_violeta_btn.setOnClickListener { color_banda2("#B838CD","7")
            Toast.makeText(this,getString(R.string.violeta), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_gris_btn.setOnClickListener { color_banda2("#636363","8")
            Toast.makeText(this,getString(R.string.gris), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban2_blanco_btn.setOnClickListener { color_banda2("#E8E4E4","9")
            Toast.makeText(this,getString(R.string.blanco), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }

        ban3_negro_btn.setOnClickListener { color_banda3("#000000",1.0)
            Toast.makeText(this,getString(R.string.negro), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_marron_btn.setOnClickListener { color_banda3("#804000",10.0)
            Toast.makeText(this,getString(R.string.marron), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_rojo_btn.setOnClickListener { color_banda3("#A50C0C",100.0)
            Toast.makeText(this,getString(R.string.rojo), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_naranja_btn.setOnClickListener { color_banda3("#FF8000",1000.0)
            Toast.makeText(this,getString(R.string.naranja), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_amarillo_btn.setOnClickListener { color_banda3("#FFEB3B",10000.0)
            Toast.makeText(this,getString(R.string.amarillo), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_verde_btn.setOnClickListener { color_banda3("#71F176",100000.0)
            Toast.makeText(this,getString(R.string.verde), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_azul_btn.setOnClickListener { color_banda3("#3F51B5",1000000.0)
            Toast.makeText(this,getString(R.string.azul), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_dorado_btn.setOnClickListener { color_banda3("#e6ac00",0.1)
            Toast.makeText(this,getString(R.string.dorado), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban3_plateado_btn.setOnClickListener { color_banda3("#CACECF",0.01)
            Toast.makeText(this,getString(R.string.plateado), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }

        ban4_marron_btn.setOnClickListener { color_banda4("#804000","+-1%")
            Toast.makeText(this,getString(R.string.marron), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban4_rojo_btn.setOnClickListener { color_banda4("#A50C0C","+-2%")
            Toast.makeText(this,getString(R.string.rojo), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban4_dorado_btn.setOnClickListener { color_banda4("#e6ac00","+-5%")
            Toast.makeText(this,getString(R.string.dorado), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }
        ban4_plateado_btn.setOnClickListener { color_banda4("#CACECF","+-10%")
            Toast.makeText(this,getString(R.string.plateado), Toast.LENGTH_SHORT).show();
            val auxiliar_1 = ban1 + ban2
            val ohmio: Double = (auxiliar_1.toDouble()*ban3)
            val kilo: Double = (auxiliar_1.toDouble()*ban3)/1000
            val mega: Double = (auxiliar_1.toDouble()*ban3)/1000000
            respuesta_test.text = "Ohmio: "+ SPACE + ohmio.toString()+ SPACE_SIMPLE + SIM_OH + SPACE + ban4 + "\nKilo Ohmio: "+ SPACE + kilo.toString()+ SPACE_SIMPLE + SIM_kOH + SPACE + ban4 + "\nMega Ohmio: "+ SPACE + mega.toString()+ SPACE_SIMPLE + SIM_MOH + SPACE + ban4
        }


    }

    private fun color_banda1(valor: String, numero: String){
        banda1.background.setColorFilter(Color.parseColor(valor), PorterDuff.Mode.MULTIPLY);
        ban1 = numero
    }
    private fun color_banda2(valor: String, numero: String){
        banda2.background.setColorFilter(Color.parseColor(valor), PorterDuff.Mode.MULTIPLY);
        ban2 = numero
    }
    private fun color_banda3(valor: String, numero: Double){
        banda3.background.setColorFilter(Color.parseColor(valor), PorterDuff.Mode.MULTIPLY);
        ban3 = numero
    }
    private fun color_banda4(valor: String,numero: String){
        banda4.background.setColorFilter(Color.parseColor(valor), PorterDuff.Mode.MULTIPLY);
        ban4 = numero
    }
    }
