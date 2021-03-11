import com.example.mysubmission.R

object FoodData {
    private val foodName = arrayOf(
        "Kue Cucur", "Martabak Manis (Terang Bulan)", "Leker", "Onde - onde", "Dadar Gulung", "Lupis", "Kue Apam (Apem Jawa)", "Klanting (Cenil)",
        "Kue Lumpur Labu Kuning", "Klepon", "Pukis", "Nagasari", "Getuk Lindri", "Wingko (Wingko Babat)", "Awug"
    )

    private val foodDetail = arrayOf(
        "Kue Kucur atau Kucur (dalam bahasa Indonesia) atau kuih cucur (dalam bahasa Melayu), dan disebut khanom fak bua (ขนมฝักบัว) atau khanom jujun (ขนมจู้จุน or จูจุ่น) dalam bahasa Thailand, adalah kudapan tradisional di kawasan Asia Tenggara.",
        "Kue Terang Bulan atau Martabak Manis adalah kudapan sejenis panekuk yang biasa dijajakan di pinggir jalan di seluruh Indonesia dan Malaysia (khususnya Sabah). Makanan ini biasanya diisi dengan berbagai macam isian sesuai selera. Saat ini, Terang Bulan atau Martabak Manis tersedia dalam berbagai varian rasa adonan dan isian.",
        "Leker atau kue pisang Surabaya adalah salah satu makanan khas kota Surabaya. Makanan kecil ini berbeda dengan leker yang dikenal di Jakarta dan kota lainnya. Jajanan ini dimasak di atas wajan mini yang telah panas (biasanya dipanaskan di atas bara arang). Setelah cukup matang, penjual kemudian menaburkan toping sesuai keinginan. Penjual lalu melipatnya menjadi setengah lingkaran dan menyajikannya kepada pembeli.",
        "Onde-onde atau jian dui (Hanzi: 煎堆; Pinyin: jiānduī; Yale (Bahasa Kanton): jīndēui) adalah sejenis kue jajanan pasar yang populer di Indonesia. Onde-onde dapat ditemukan di pasar tradisional maupun dijual di pedagang kaki lima. Onde-onde juga populer khususnya di daerah pecinan baik di Indonesia maupun luar negeri.",
        "Kue dadar gulung (Melayu: kuih ketayap—dialek Sabah: kuih lenggang) merupakan makanan khas Indonesia dan Malaysia yang dapat digolongkan sebagai panekuk yang diisi dengan parutan kelapa yang dicampur dengan gula jawa cair.",
        "Lupis merupakan makanan khas Indonesia terutama daerah Jawa. Ada dua bentuk lupis yang umum ditemui: segitiga atau bulat memanjang seperti lontong. Lupis dibuat dari beras ketan yang dimasak lalu dibungkus dengan daun pisang.",
        "Apam atau apem (dikenal juga dengan appam di negeri asalnya India) adalah makanan yang terbuat dari tepung beras yang didiamkan semalam dengan mencampurkan telur, santan, gula dan tape serta sedikit garam kemudian dibakar atau dikukus. Bentuknya mirip serabi, tetapi lebih tebal.",
        "Klanting adalah salah satu camilan tradisional Jawa. Klanting terbuat dari tepung jagung, menjadikan tekstur makanan ini seperti karet mirip agar-agar. Warna klanting dapat bermacam-macam, termasuk merah dan hijau. Makanan ini sebenarnya hambar, dan secara tradisional dibubuhi parutan kelapa dan gula merah. Makanan ini biasanya dimakan bersama dengan lupis.",
        "Kue basah tradisional yang popular dengan sebutan kue lumpur ini memiliki ciri khas berbentuk bundar dengan teksturnya yang lembut. Cara penyajiannya pun menggunakan berbagai macam topping seperti kismis, kelapa, atau keju.",
        "Klepon atau kelepon adalah sejenis makanan tradisional atau kue tradisional Indonesia yang termasuk ke dalam kelompok jajanan pasar. Makanan ini terbuat dari tepung beras ketan yang dibentuk seperti bola-bola kecil dan diisi dengan gula merah. Biasanya klepon diletakkan di dalam wadah yang terbuat dari daun pisang.",
        "Pukis adalah modifikasi dari kue wafel. Variasinya bermacam-macam, diberi taburan coklat butir, keju, selai nanas, sukade (manisan buah, biasanya dari pepaya dan dipotong kecil kecil serta berwarna warni) atau kacang. Kue pukis memiliki bentuk dan warna yang khas. Bagian atasnya berwarna kuning dan bagian bawahnya kecoklatan.",
        "Kue Nagasari atau Kue Nogosari (sebutan dalam bahasa Jawa) merupakan jenis kue basah tradisional yang sangat populer dan selalu diwariskan turun-menurun dari generasi ke generasi dalam masyarakat Jawa. Umumnya, kue nagasari ini akan selalu ada saat hari besar menurut tanggalan orang Jawa, seperti Kenduri.",
        "Getuk (Hanacaraka:ꦒꦼꦛꦸꦏ꧀, bahasa Jawa: gethuk) adalah makanan ringan yang terbuat dengan bahan utama ketela pohon atau singkong. Getuk merupakan makanan yang mudah ditemukan di Jawa Tengah dan Jawa Timur. Sebagai pelengkap, biasanya getuk ditaburi dengan parutan kelapa. Getuk lindri adalah getuk yang digiling halus dengan gula pasir, dibubuhi pewarna makanan dan vanili, dan selanjutnya dicetak dengan bentuk memanjang dan dipotong kecil-kecil.",
        "Wingko atau sering disebut juga Wingko babat adalah makanan tradisional khas Indonesia. Wingko sangat terkenal di pantai utara pulau Jawa. Wingko adalah sejenis kue yang terbuat dari kelapa muda, tepung beras ketan dan gula.",
        "Awug adalah kue khas Sunda asal Cimahi. Kue ini berwarna putih bercampur dengan warna coklat yang berasal dari campuran tepung beras, kelapa, aroma daun pandan dan gula merah yang dikukus di dalam aseupan (kukusan berbentuk lancip untuk membuat tumpeng) dengan beralaskan daun pisang. Kue ini biasanya dibuat oleh masyarakat lokal saat panen usai. Awug mudah ditemui di pedagang kaki lima."
    )

    private val foodPic = arrayOf(
        R.drawable.cucur,
        R.drawable.martabakmanis,
        R.drawable.leker,
        R.drawable.ondeonde,
        R.drawable.dadargulung,
        R.drawable.lupis,
        R.drawable.apam,
        R.drawable.klanting,
        R.drawable.kuelumpur,
        R.drawable.klepon,
        R.drawable.pukis,
        R.drawable.nagasari,
        R.drawable.getuklindri,
        R.drawable.wingko,
        R.drawable.awug
    )

    private val foodMaterial = arrayOf(
        "-\t125 gram Tepung beras\n-\t100 gram Tepung terigu protein sedang\n-\t140 gram Gula merah\n-\t40 gram Gula pasir\n-\t200 mL Air\n-\t1 lembar Daun pandan\n-\tSejumput Garam",
        "-\t1 butir Telur\n-\t2 sdm Gula pasir\n-\t150 gram Tepung terigu\n-\t225 mL Susu cair\n-\t1 sdt Soda kue\n-\t1 sdt Perisa Vanila\n-\t2 sdm Margarin cair",
        "-\t100 gram Tepung beras\n-\t40 gram Tepung maizena\n-\t20 gram Tepung terigu\n-\t80 gram Gula pasir\n-\t½ sdt Garam\n-\t1 butir Telur\n-\t225 mL Susu cair\n-\t½ sdt Baking soda",
        "-\t200 gram Tepung ketan\n-\t50 gram Kentang kukus yang sudah dihaluskan\n-\t5 sdm Gula pasir halus\n-\t¼ sdt Garam\n-\t190 mL Air Hangat\n-250 gram Kacang hijau tanpa kulit yang sudah dihaluskan\tSecukupnya wijen putih\n-\tSecukupnya minyak untuk menggoreng",
        "-\t150 gram Kelapa parut kasar\n-\t1 lembar Daun pandan\n-\t½ sdt Garam\n-\t50 gram Gula pasir (boleh diganti gula merah)\n-\t100 mL Air\n-\t100 gram Tepung terigu protein sedang\n-\t¼ sdt Garam\n-\t1 butir Telur\n-\t300 mL Santan\n-\t4 tetes Pewarna sesuai selera",
        "-\t500 gram Beras ketan\n-\t1 sdm Garam\n-\tDaun pisang secukupnya\n-\tTusuk gigi/potongan lidi secukupnya\n-\tAir untuk merebus\n-\tParutan kelapa secukupnya\n-\tGula merah cair",
        "-\t100 gram Tape singkong manis\n-\t200 gram Gula pasir\n-\t250 gram Tepung beras\n-\t60 gram Tepung terigu\n-\t1 sdt Ragi instan\n-\t400 mL Santan hangat",
        "-\t1 kg Singkong diparut halus\n-\t4 sdm Gula pasir\n-\t2 sdm Tepung tapioka\n-\tGaram secukupnya\n-\t4 lembar Daun pandan\n-\tParutan kelapa secukupnya\n-\tTusuk sate secukupnya (opsional)",
        "-\t450 gram Labu kuning kukus\n-\t450 mL Santan\n-\t225 gram Gula pasir\n-\t225 gram Tepung terigu\n-\t100 gram Margarin yang telah dilelehkan\n-\t3 butir Telur\n-\t½ sdt Garam\n-\t1 sdt Perisa vanila",
        "-\t100 gram Kelapa Parut (untuk taburan)\n-\t200 gram Tepung Ketan\n-\t25 gram Tepung Beras\n-\t½ sdt Garam Halus\n-\t½ sdt Pasta Pandan (atau pewarna makanan hijau)\n-\t180 mL Air\n-\t75 gram Gula Merah (potong halus)\n-\t1 lembar Daun Pandan\n-\tAir secukupnya untuk merebut",
        "-\t1 sdt Ragi instan\n-\t50 mL Air hangat\n-\t2 butir Telur\n-\t60 gram Gula pasir-\t¼ sdt Garam\n-\t120 gram Tepung terigu protein sedang\n-\t100 mL Susu cari\n-\t1 sdm Margarin",
        "-\t200 gram Tepung beras\n-\t125 gram Gula pasir\n-\t300 mL Santan kental\n-\t500 mL Santan cair\n-\t1 sdt Vanili bubuk\n-\tGaram secukupnya\n-\t2 lembar Daun pandan\n-\t4 buah Pisang kepok matang\n-\tDaun pisang untuk membungkus",
        "-\t1 kg Singkong\n-\t350 gram Gula pasir\n-\t1 sdt Pewarna makanan (sesuai selera)\n-\t1 sdt Garam\n-\tSecukupnya kelapa tua parut yang sudah dikukus",
        "-\tSecukupnya kelapa tua parut yang sudah dikukus\n-\t250 gram Gula pasir\n-\t150 gram Tepung ketan putih\n-\t50 gram Tepung tapioka\n-\t½ sdt Garam\n-\t1 sdt Pasta vanili\n-\t150 mL Santan kental yang direbus dengan daun pandan\n-\t1 butir Telur kocok lepas\n-\t1 sdm Minyak goreng",
        "-\t¼ kg Tepung beras yang berkualitas bagus\n-\t¼ kg Tepung beras ketan yang berkualitas bagus\n-\t½ liter Air bersih\n-\t2 sendok teh Garam dapur\n-\t1 butir Kelapa, kemudian parut\n-\t¼ kg Gula merah, lalu sisir halus\n-\tUntuk alas siapkan Daun pisang  secukupnya"
    )

    private val foodTutorial = arrayOf(
        "1.\tRebus gula merah, gula pasir, air, daun pandan hingga larut lalu saring dan biarkan hingga hangat.\n2.\tCampurkan tepung beras dan tepung terigu. Lalu tambahkan campuran larutan gula yang telah disaring, aduk hingga rata.\n3.\tDiamkan adonan selama 15 menit lalu aduk kembali.\n4.\tPanaskan minyak goreng secukup di dalam wajan. Aduk adonan kembali sebelum digoreng.\n5.\tTuang satu sendok sayur adonan ke dalam minyak yang sudah panas. Siram perlahan bagian atasnya dengan minyak hingga matang. Angkat dan tiriskan.",
        "1.\tKocok telur dan gula sampai larut. Masukkan tepung dan fresh milk bergantian. Aduk rata.\n2.\tTambahkan soda kue dan vanila. Aduk kembali lalu masukkan margarin cair. Aduk rata.\n3.\tCetak dan beri toping sesuai selera.",
        "1.\tCampur semua bahan jadi 1, aduk dengan whisk.\n2.\tPanaskan pan dengan api sedang, setelah panas, kecilkan api.\n3.\tTuang satu sendok sayur adonan ke pan, ratakan dengan kuas hingga lapisan tipis.\n4.\tTaburi toping sesuai selera, tunggu hingga kecoklatan, lipat, angkat.",
        "1.\tCampur tepung ketan, kentang halus, gula dan garam.\n2.\tTambahkan air hangat secara bertahap sambil uleni adonan.\n3.\tTimbang adonan masing - masing 20 gram, pipihkan lalu tambahkan isian kacang hijau dan bulatkan kembali.\n4.\tGulingkan pada wijen. Pastikan wijen menempel pada adonan.\n5.\tMasukkan onde - onde pada minyak yang belum panas hingga keluar gelembung kecil. Kemudian aduk perlahan dan tingkatkan api secara perlahan.\n6.\tApabila onde - onde sudah terasa ringan, angkat dan tiriskan.",
        "1.\tUntuk membuat isian, campur kelapa parut, daun pandan, gula pasir dan air. Masak sambil diaduk hingga meresap.\n2.\tUntuk membuat kulit, campur tepung terigu, dan garam dalam wadah.\n3.\tMasukkan telur dan santan sedikit – sedikit. Aduk sampai licin.\n4.\tTambahkan pewarna makanan sesuai selera. Aduk rata.\n5.\tBuat dadar tipis di wajan datar kecil yang dipanaskan dan dioles minyak. Masak hingga matang lalu angkat.\n6.\tAmbil selembar kulit, beri isian secukupnya. Lipat sisi kiri dan kanannya, lalu gulung.",
        "1.\tCuci berat ketan hingga bersih.\n2.\tRendam dengan air dan garam selama 15 menit, lalu saring.\n3.\tPotong daun pisang, lalu bentuk menjadi segitiga (bisa juga dibentuk lonjong seperti lontong).\n4.\tMasukkan beras ketan ke daun pisang, lipat dan tusuk menggunakan tusuk gigi agar tertutup rapat.\n5.\tRebus selama 20 menit, angkat dan tiriskan hingga kering.\n6.\tSajikan lupis dengan taburan kelapa dan gula merah.",
        "1.\tCampur tape singkong dan gula pasir, aduk rata hingga tape halus.\n2.\tMasukkan tepung beras, terigu, dan ragi. Aduk rata.\n3.\tTuang santan hangan secara bertahap sambil uleni adonan hingga terasa ringan/\n4.\tTutup adonan dengan kain selama 1 jam hingga mengembang.\n5.\tPanaskan cetakan dengan api kecil, olesi sedikit minyak/margarin. Tuang adonan sampai penuh, tunggu hingga permukaan adonan muncul lubang-lubang kecil, tutup cetakan hingga matang lalu sajikan.",
        "1.\tDidihkan air secukupnya bersama daun pandan.\n2.\tCampur semua bahan menjadi satu, aduk hingga tercampur rata.\n3.\tBentuk bulat-bulat kecil (boleh juga lonjong memanjang)/\n4.\tMasukkan ke dalam air yang sudah didihkan bersama daun pandan.\n5.\tApabila adonan sudah mengapung, angkat dan tiriskan.\n6.Gulingkan pada parutan kelapa lalu tusuk dengan tusuk sate. Sajikan",
        "1.\tHaluskan labu kuning kukus dengan garpu.\n2.\tCampurkan dengan semua bahan, aduk rata hingga adonan halus.\n3.\tPanaskan cetakan dengan api kecil.\n4.\tTuang adonan hingga ¾ penuh.\n5.\tApabila adonan sudah setengah matang, tambahkan toping sesuai selera (bisa ditambahkan kismis, kelapa, atau nangka). Masak hingga matang lalu sajikan.",
        "1.\tKukus bahan taburan kelapa sekitar 15 menit. Angkat dan sisihkan.\n2.\tCampur dan aduk rata tepung ketan, tepung beras, garam halus.\n3.\tCampur air, dan pasta pandan, aduk rata. Tuang bertahap pada tepung sambil diuleni sampai bisa di bentuk.\n4.\tAmbil sedikit adonan, beri isian gula merah, bulatkan.\n5.\tRebus bola bola dalam air yang sudah mendidih.\n6.\tAngkat ketika sudah mengapung dan balur dengan taburan kelapa.",
        "1.\tAduk rata ragi instan dan air hangat. Diamkan 15 menit.\n2.\tKocok telur, gula pasir, dan garam hingga mengembang.\n3.\tTambahkan tepung terigu dan aduk rata.\n4.\tTambahkan larutan ragi instan, aduk rata.\n5.\tMasukkan susu cair secara bertahap sambil diaduk rata. Diamkan selama 30 menit.\n6.\tLelehkan margarin lalu campurkan ke dalam adonan dan aduk rata.\n7.\tPanaskan cetakan pukis. Tuang adonan, beri toping, tutup, dan biarkan sampai matang. Sajikan",
        "1.\tKukus pisang kepok lalu potong-potong, sisihkan.\n2.\tLarutkan tepung beras dan santan kental, aduk rata. Sisihkan.\n3.\tDalam panci, campur santan cair dengan gula, garam, vanili bubuk, dan daun pandan. Masak hingga mendidih.\n4.\tTuang larutan tepung beras ke dalam panci sambil diaduk hingga mengental. Angkat.\n5.\tAmbil selembar daun pisang beri satu sendok adonan, letakkan potongan pisang kembudian tutup lagi dengan satu sendok adonan, lalu lipat kedua ujung jalan. Lakukan hingga adonan habis.\n6.\tPanaskan kukusan, kukus kue dengan api sedang selama 20 menit (hingga matang), angkat dan sajikan.",
        "1.\tKupas singkong lalu rebus hingga empuk.\n2.\tHaluskan singkong tersebut hingga kalis.\n3.\tTambahan garam dan gula, uleni hingga tercampur.\n4.\tBagi adonan sesuai dengan jumlah warna yang diinginkan, tambahkan pewarna dan uleni hingga rata.\n5.\tBentuk getuk lindri sesaui keinginan atau dengan cetakan, lalu kukus hingga matang.\n6.\tAngkat dan gulingkan pada parutan kelapa, sajikan.",
        "1.\tCampurkan semua bahan kecuali santan, telur, dan minyak goreng. Aduk hingga rata.\n2.\tMasukkan santan sedikit demi sedikit, sambil uleni hingga kalis.\n3.\tMasukkan kocokan telur dan minyak goreng. Aduk hingga rata.\n4.\tPanaskan wajan cetakan dan olesi dengan margarin.\n5.\tTuang 1 senduk penuh adonan. Masak pada api kecil hingga kuning kecoklatan di kedua sisi. Angkat dan sajikan.",
        "1.\tCampurkan ke dalam satu wadah seperti tepung beras, tepung ketan garam dan air. Aduk rata dan tambahkan dengan parutan kelapa.\n2.\tPisahkan adonan awug menjadi beberapa bagian saja.\n3.\tKemudian isikan sisiran gula merah di bagian tengah masing-masing adonan. Berikutnya bungkus menggunakan daun pisang.\n4.\tMasukkan adonan awug pada kukusan dan kukus sampai matang.\n5.\tJika sudah, angkat dan biarkan agar tidak terlalu panas. Simpan pada wadah saji."
    )

    val listMakanan: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = foodDetail[position]
                food.pic = foodPic[position]
                food.material = foodMaterial[position]
                food.tutorial = foodTutorial[position]
                list.add(food)
            }
            return list
        }
}