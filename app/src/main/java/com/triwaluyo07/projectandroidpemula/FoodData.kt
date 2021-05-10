package com.triwaluyo07.projectandroidpemula

object FoodData {
    private val foodNames = arrayOf(
        "Ayam Pinadar",
        "Gulai Belacan",
        "Gulai Ikan Patin",
        "Kaci Muih",
        "Mie Bangka",
        "Mie Aceh",
        "Otak Otak",
        "Pempek",
        "Pendap",
        "Seruit"

    )

    private val foodsubtitle = arrayOf(
        "Sumatera Utara",
        "Riau",
        "Jambi",
        "Sumatera Barat",
        "Bangka Belitung",
        "Aceh",
        "Kepulauan Riau",
        "Sumatera Selatan",
        "Bengkulu",
        "Lampung"
    )

    private val foodDetails = arrayOf(
        "Ayam Pinadar juga lazim disebut manuk na pinadar. Masakan ini adalah ayam bakar khas Batak Toba yang sungguh memukau rasa pedasnya sangat menggigit karena memakai andaliman. Masakan ini memakai bahan yang uni yaitu hati ayam dan gota (darah ayam).  Sekarang karena berbagai pertimbangan masakan ini tidak menggunakan gota atau darah ayam lagi.",
        "Gulai Belacan salah satu masakan khas dari Riau. Gulai ini dibuat dengan kuah campuran belacan atau terasi. Bahannya biasanya memakai udang atau ikan.",
        "Gulai ikan Patin adalah masakan yang populer di masyarakat Jambi.  Gulai ini dimasak dengan menggunakan tempoyak yaitu daging buah durian yang telah difermentasi. Tetapi ada sebagian orang yang memilih untuk mengganti tempoyak dengan santan kelapa untuk menghindari bau dan rasa tempoyak yang cukup menyengat.",
        "Olahan khas Sumatera Barat cukup melimpah yang salah satunya adalah Kacimuih. Walaupun dibuat dengan bahan dasar singkong yang cenderung “ndeso”, namun setelah menjadi kacimuih maka rasanya akan berbeda. Pembuatannya dilakukan dengan bahan singkong, gula (bisa gula putih bisa gula merah), dan parutan kelapa. Bentuknya terbilang sederhana ketela pohon tadi akan ditumbuk dengan kelapa parut maupun gula. Namun rasanya akan sangat nikmat di mulut, ada rasa gurihnya parutan kelapa maupun manisnya gula.",
        "Mie Bangka adalah salah satu dari sekian banyak ciri khas masyarakat pulau Bangka. Terbuat dari mie basah (kuning) biasa yang disiram dengan kuah berbumbu yang biasanya terbuat dari ikan, udang, cumi atau kepiting dan seringkali ditambahi dengan toge atau kecambah, mentimun, dan kerupuk. Lezat bila dihidangkan waktu masih panas dan ditambah rasa pedas dari cabe.",
        "Provinsi Aceh terkenal dengan Mie Acehnya. Mie kuning tebal dengan irisan daging disajikan dalam sup sejenis kari yang gurih dan pedas. Makanan ini benar-benar kaya bumbu.",
        "Otak-otak adalah salah satu makanan khas di Kepulauan Riau, baik di Batam, Tanjung Pinang, maupun di Pulau Penyengat. Di sini terdapat dua jenis otak-otak yaitu otak-otak yang terbuat dari ikan dan dari cumi yang lebih pedas. Otak-otak ini dibungkus dengan daun berwarna hijau sekalian dengan lidinya, yang kemudian dibakar dengan bara api.",
        "Di Sumatera Selatan terkenal makanan Pempek. Pempek terbuat dari ikan dan sagu. Penyajianya ditemani dengan kuah cokelat yang disebut cuko. Cuko terbuat dari air yang dididihkan, kemudian ditambah gula merah, udang rebi dan cabe rawit tumbuk, bawang putih, dan garam.",
        "Pendap merupakan makanan bercitarasa pedas yang sangat populer di provinsi Bengkulu. Pendap terdiri dari bahan ikan yang dicampur dengan beberapa bahan utama seperti bawang putih, kencur, cabai giling, kelapa muda yang kemudian dimasak dalam balutan daun talas.",
        "Seruit adalah makanan khas provinsi Lampung yaitu masakan ikan yang digoreng atau dibakar dicampur sambal terasi, tempoyak (olahan durian) atau mangga."
    )

    private val foodsImage = intArrayOf(
        R.drawable.ayam_pinadar,
        R.drawable.gulai_belacan,
        R.drawable.gulai_ikan_patin,
        R.drawable.kaci_muih,
        R.drawable.mie_bangka,
        R.drawable.mieaceh,
        R.drawable.otak_otak,
        R.drawable.pempek,
        R.drawable.pendap,
        R.drawable.seruit
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for(position in foodNames.indices){
                val food = Food()
                food.name = foodNames[position]
                food.subtitle = foodsubtitle[position]
                food.detail = foodDetails[position]
                food.photo = foodsImage[position]
                list.add(food)
            }
            return list
        }
}