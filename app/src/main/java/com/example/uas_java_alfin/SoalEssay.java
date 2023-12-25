package com.example.uas_java_alfin;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "Siapa nama presiden Indonesia yang pertama ?",
            "Ideologi dasar bagi negara Indonesia adalah ...",
            "Bhinneka Tunggal Ika mempunyai arti ...",
            "Ibukota negara Indonesia saat ini adalah ...",
            "Siapa yang menjajah Indonesia selama 350 tahun ?",
            "Saat masa penjajahan, senjata yang biasa digunakan oleh pahlawan Indonesia adalah ...",
            "Monumen pada gambar sering disebut ...",
            "Teks yang dibacakan Ir. Soekarno yang menyatakan Indonesia merdeka dalah teks ...",
            "Pulau terbesar di Indonesia adalah ...",
            "Dimana letak Stadion Gelora Bung Karno ...",
            "Siapa pencipta buku Habis Gelap Terbitlah Terang ...",
            "Apa nama Rumah Adat diatas ...",
            "Siapa nama tokoh proklamasi diatas ...",
            "Apa kepanjangan dari BPUPKI ...",
    };
    //membuat array untuk set gambar (dari String diubah jadi ImageView)
//pastikan yang tertulis disini sama dengan nama di drawable
//lihat gambar penjelasan1
    private String image[] = {
            "foto_soekarno",
            "lambang_garuda",
            "lambang_garuda",
            "jakarta",
            "penjajahan",
            "bambu_runcing",
            "monas",
            "teks_proklamasi",
            "pulau_kalimantan",
            "gbk",
            "kartini",
            "rumah_gadang",
            "moh_hatta",
            "bpupki",
    };
    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "Ir. Soekarno",
            "Pancasila",
            "Berbeda-beda tetapi tetap satu",
            "Jakarta",
            "Belanda",
            "Bambu runcing",
            "Monas",
            "Proklamasi",
            "Kalimantan",
            "Jakarta",
            "Kartini",
            "Rumah gadang",
            "Moh Hatta",
            "Badan Penyelidik Usaha Persiapan Kemerdekaan Indonesia",
    };
    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }
    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

