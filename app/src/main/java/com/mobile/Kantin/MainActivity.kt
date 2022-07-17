package com.mobile.Kantin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Kantinlist = listOf<Kantin>(
            Kantin(
                R.drawable.nasigoreng,
                "Nasi Goreng",
                "Nasi goreng merupakan sajian nasi yang digoreng dalam sebuah wajan atau penggorengan menghasilkan cita rasa berbeda karena dicampur dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica dan kecap manis. Selain itu, ditambahkan bahan-bahan pelengkap seperti telur, sayur-sayuran, makanan laut, atau daging"
            ),

            Kantin(
                R.drawable.rendang,
                "Rendang",
                "Rendang atau randang (Jawi: رندڠ) adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak suhu rendah dalam waktu lama menggunakan aneka rempah-rempah dan santan. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat dan dedak. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan."
            ),

            Kantin(
                R.drawable.otak,
                "Otak Otak",
                "Otak-otak adalah makanan yang terbuat dari daging tenggiri cincang yang dibungkus dengan daun pisang, dipanggang, dan disajikan dengan kuah asam pedas. Penganan ini populer di kawasan Sumatera Selatan dan Tanjung Pinang serta Selat Melaka dan Selat Karimata, seperti Kepulauan Riau, Singapura, dan Malaysia, tetapi tersebar luas pula di berbagai kota di Sumatra dan Jawa. Di Malaysia, Muar terkenal dengan otak-otaknya."
            ),
            Kantin(
                R.drawable.pempek,
                "Pempek",
                "Pempek atau empek-empek adalah makanan yang terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain seperti telur, bawang putih yang dihaluskan, penyedap rasa, dan garam.[1] Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas. Pempek sering disebut sebagai makanan khas Palembang,[2] meskipun hampir semua daerah di Sumatera Selatan, Jambi dan Bengkulu juga memproduksinya."
            ),
            Kantin(
                R.drawable.bikaambon,
                "Bika Ambon",
                "Bika ambon adalah penganan khas Medan, Indonesia. Terbuat dari bahan-bahan seperti tepung tapioka, telur, gula, dan santan. Kini Bika Ambon dijual bukan saja rasa asli tetapi sudah ada varian rasa pandan, durian, keju, dan cokelat. Bika ambon yang dimasak selama 12 jam[1] ini biasanya dapat bertahan dalam kondisi terbaik selama empat hari karena setelah itu kue tersebut mulai mengeras. Kue basah ini biasanya memiliki jaring-jaring pada bagian dalamnya. Terdapat pula bika ambon yang dijual dengan berbagai varian rasa seperti pandan, coklat, keju dan lain-lain."
            ),
            Kantin(
                R.drawable.nasiliwet,
                "Nasi Liwet",
                "Ribuan tahun yang lalu, lima suku Afrika berperang atas meteorit yang mengandung vibranium logam. Seorang prajurit menelan \"ramuan berbentuk hati\" yang dipengaruhi oleh logam dan mendapatkan kemampuan manusia super, menjadi \"Black Panther\" pertama. Dia menyatukan semua kecuali Suku Jabari untuk membentuk bangsa Wakanda. Selama berabad-abad, Wakanda menggunakan vibranium untuk mengembangkan teknologi canggih dan mengisolasi diri dari dunia dengan menyamar sebagai negara Dunia Ketiga."
            ),
            Kantin(
                R.drawable.tempe,
                "Tempe",
                "Tempe (bahasa Jawa: , translit. Témpé) adalah makanan khas Indonesia yang terbuat dari fermentasi kedelai atau beberapa bahan lain yang menggunakan beberapa jenis kapang Rhizopus, seperti Rhizopus oligosporus, Rh. oryzae, Rh. stolonifer (kapang roti), atau Rh. arrhizus. Sediaan fermentasi ini secara umum dikenal sebagai \"ragi tempe\"."
            ),
            Kantin(
                R.drawable.gudeg,
                "Gudeg",
                "Gudeg (bahasa Jawa: , translit. Gudhěg) adalah hidangan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan. Perlu waktu berjam-jam untuk membuat hidangan ini. Warna coklat biasanya dihasilkan oleh daun jati yang dimasak bersamaan. Gudeg biasanya dimakan dengan nasi dan disajikan dengan kuah santan kental (areh), ayam kampung, telur, tempe, tahu dan sambal goreng krecek."
            ),
            Kantin(
                R.drawable.supkonro,
                "Sup Konro",
                "Sup konro adalah masakan sup iga sapi khas Indonesia yang berasal dari tradisi Bugis dan Makassar.[1] Sup ini biasanya dibuat dengan bahan iga sapi atau daging sapi.[1][2] Masakan berkuah warna coklat kehitaman ini biasa dimakan dengan burasa dan ketupat yang dipotong-potong terlebih dahulu. Warna gelap ini berasal dari buah kluwek yang memang berwarna hitam."
            ),
            Kantin(
                R.drawable.mieaceh,
                "Mie Aceh",
                "Mi aceh adalah masakan mi pedas khas Aceh di Indonesia. Mie kuning tebal dengan irisan daging sapi, daging kambing atau makanan laut (udang dan cumi) disajikan dalam sup sejenis kari yang gurih dan pedas. Mi aceh biasanya ditaburi dengan bawang goreng dan disajikan bersama emping, potongan bawang merah, mentimun, dan jeruk nipis."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KantinAdapter(this, Kantinlist){
            val intent = Intent(this, DetailKantinActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}