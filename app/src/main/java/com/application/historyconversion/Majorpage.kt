package com.application.historyconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Majorpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_majorpage)


        //Code Attribution
        // This method was taken from stackoverflow
        //https://stackoverflow.com/questions/3307090/how-to-add-background-image-to-activity
        //Paresh Mayani
        //https://stackoverflow.com/users/379693/paresh-mayani


        val etAge = findViewById<EditText>(R.id.age).text

        val btnbegin = findViewById<Button>(R.id.Beginning)
        val btnclear = findViewById<Button>(R.id.Exit2)


        val tvresult = findViewById<TextView>(R.id.Feedback)




        btnclear.setOnClickListener {
            etAge.clear()
            tvresult.setText(null)

        }







        btnbegin.setOnClickListener {

            val age = etAge.toString().toInt()





            if (age.toInt() < 20) {
                tvresult.text = "Your age doesn't meet the requirements"
            } else {
                if (age.toInt() > 100) {
                    tvresult.text = "Your age doesn't meet the requirements"
                } else {
                    if (age == 25) {
                        tvresult.text =
                            "You are the same age as Wilfred Owen,He was an English soldier and poet.One of the most important" +
                                    "during world war I,owen wrote about the horrors of gas welfare.His life and career" +
                                    "inspired a docudrama titled Wilfred Owen"

                    } else {
                        if (age == 36) {
                            tvresult.text =
                                "You are the same age as Bob Marley,He was Jamaican reggae singer,guitarist and songwriter.He helped to popularize reggae" +
                                        "music around the worldMarley was hugely influential as a musician,and as an advocate for peace.He was a man" +
                                        "with no time,with a mission that no one in popular music music had ever attempted before"
                        } else {
                            if (age == 39) {
                                tvresult.text =
                                    "You are the same age as Malcom X,He was an african american leader of civil rights movement,Malcom was a vocal" +
                                            "spokesman of the Nation of Islam and called upon the blacks to protect themselves from the white,even if it meant adopting" +
                                            "violence.His radical views and preaching later evolved and he accepted the possibility of peaceful resolution of radical in America"
                            } else {
                                if (age == 30) {
                                    tvresult.text =
                                        "You are the same age as Steve biko,He was one of South Africa's most significant political activists and a leading" +
                                                "founder of South Africa's Black Consciousness Movement.He developed the view that to avoid white domination his activism " +
                                                "attempted to empower black people.His famous for the solgan of black is beautiful "
                                } else {
                                    if (age == 50) {
                                        tvresult.text =
                                            "You are the same age as Franz Ferdinand,He was the heir apparent to the Austro-Hungarian throne;his assassination" +
                                                    "led to the outbreak of World War I.He is known for uniting the Spanish kingdoms into the nation of Spain,supporting the" +
                                                    "spanish inquisition,sponsoring Christopher Columbus's voyages of exploration across the Atlantic Ocean,and commencing Spain's" +
                                                    "entry into the modern period of imperial expansion"
                                    } else {
                                        if (age == 61) {
                                            tvresult.text =
                                                " You are the same age as Empress Elisabeth of Austria,She is the longest-reigning Austrian Empress in history at" +
                                                        "44 she is recognized for her long brown hair,a key feature in her painted portraits.Due to the length of her hair the care" +
                                                        "regime and styling process by her Franziska Feifalik became notable as it was a multi-hour task."
                                        } else {
                                            if (age == 73) {
                                                tvresult.text =
                                                    "You are the same age as Charles Darwin,He is known as the architect of the theory of evolution by natural selection" +
                                                            "Darwin defined evolution as descent with modification,the idea that species change over time,give rise to new species and" +
                                                            "share a common ancestor.Only those with favorable traits survive.  "
                                            } else {
                                                if (age == 81) {
                                                    tvresult.text =
                                                        "You are the same age as Hedy Lamar,was an Austrian-American actress and inventor who pioneered the technology that" +
                                                                "would one day for basis for today's wifi,Gps and Bluetooth communication systems.At the beginning of World War II,along" +
                                                                "with avant-garde composer George Antheil,she co-invented a raido that used spread spectrum and frequency hopping technology" +
                                                                "to defeat the threat of radio jamming by Axis powers."
                                                } else {
                                                    if (age == 90) {
                                                        tvresult.text =
                                                            "You are the same age Albertina Sisulu,She was a political activist,nurse and community activist and also one of the " +
                                                                    "high-profile leaders of anti apartheid resistance in South Africa.Their powerful contributions to our struggle for freedom" +
                                                                    "charted the way for a country that belong to all South Africans.She played a formative role in the opposition to apartheid" +
                                                                    "" +
                                                                    "and in building a non-racist,non-sexist and democratic South Africa."
                                                    } else {
                                                        if (age == 91) {
                                                            tvresult.text =
                                                                "You are the same age as Michael Collins,was an American astronaut who flew the Apollo 11 command module Columbia " +
                                                                        "around the Moon in 1969 while his crew mates, Neil Armstrong and Buzz Aldrin, made the first crewed landing on the surface. " +
                                                                        "He was also a test pilot and major general in the U.S. Air Force Reserve.Michael Collins was the second man to orbit the moon" +
                                                                        "alone"
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }

                }


            }
        }
    }
}















































































