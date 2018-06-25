package com.keyalive.anonim.kuisioner;

public class SoalYaTidak {

    public String pertanyaan[]={
//            com.keyalive.anonim.kuisioner.Visual
      "Kamu rapi dan teratur",
            "Kamu suka berbicara dengan cepat",
            "Kamu suka merencanakan kegiatan beberapa hari sebelumnya",
            "Kamu dapat melihat/ membaca tulisan di dalam pikiranmu",
            "Kamu lebih mudah mengingat apa yang dilihat daripada di dengar",
            "Kamu dapat menghafal cukup dengan membayangkan saja",
            "Kamu selalu membayangkan disaat sedang membaca cerita",
            "Kamu lebih suka membaca daripada dibacakan",
            "Kamu suka mencoret-coret saat menelepon / mendengar guru",
            "Kamu lebih menyukai gambar/ lukisan daripada musik",
            "Kamu sering tau apa yang harus dikatakan \n tetapi tidak terpikir kata-kata yang tepat",
            "Kamu lebih suka memperagakan sesuatu daripada hanya sekedar bicara",
//              Auditori
            "Kamu suka berbicara kepada sendiri saat sedang melakukan pekerjaan",
            "Konsentrasi kamu mudah terganggu jika ada kebisingan",
            "Kamu suka ikut menggerakkan bibir ketika sedang membaca",
            "Ketika kamu  menghafal kamu membacanya keras-keras dan mendengarkannya",
            "Kamu tidak suka menulis, tapi senang bercerita",
            "Kamu berbicara dengan ada nada berirama (tidak datar-datar saja)",
            "Kamu adalah seseorang yang pintar berbicara (pintar ngomong)",
            "Kamu lebih menyukai musik daripada gambar/ lukisan",
            "Kamu lebih suka mendengarkan untuk mengingat \n apa yang dibicarakan daripada melihat",
            "Kamu lebih banyak berbicara, suka berdiskusi,\n dan menjelaskan panjang lebar",
            "Saya lebih suka mendengar daripada membaca",
            "Saya merasa kesulitan pada pelajaran seni rupa",
//              Kinestetik
            "Kamu biasa berbicara dengan perlahan",
            "Kamu cenderung berdiri dekat-dekat saat\n sedang berbicara dengan seseorang",
            "Kamu menyukai gerakan dan sulit diam (banyak bergerak)",
            "Kamu belajar dengan melalui praktik dan mencoba-coba",
            "Kamu bisa menghafal sambil berjalan dan melihat",
            "Kamu sering menggunakan jari untuk menunjuk disaat sedang membaca",
            "Kamu sering menggunakan bahasa isyarat tubuh",
            "Kamu sulit untuk duduk diam dalam waktu yang lama",
            "Kamu membuat keputusan berdasarkan perasaan",
            "Kamu suka mengetuk-ngetuk pena, jari, atau kaki saat \n mendengarkan guru berbicara",
            "Kamu suka menggunakan waktu luang untuk \n berolahraga dan kegiatan fisik lainnya",
            "Ruang kamar, meja belajar, atau kasur saya \n biasanya berantakan/ tidak teratur",

    };


    private String pilihanJawaban[][] = {
//            com.keyalive.anonim.kuisioner.Visual
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
//              Kinestetik
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},

            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},
            {"Ya","Tidak"},


    };
    private String JawabanBenar[] = {
//           com.keyalive.anonim.kuisioner.Visual
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",

            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",

            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
            "Ya",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }
    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = JawabanBenar[x];
        return jawaban;
    }
}
