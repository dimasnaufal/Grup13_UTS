# Grup13_UAS

# Nama & No Absen
Dimas Naufal Fikri      (8)
Faisal Firman Hakim     (10)
Wahyu Arum              (26)

# Judul aplikasi dan deskripsi singkatnya 
Meme Creator adalah aplikasi yang berisi tentang karakter-karakter meme beserta penjelasannya dan mengganti wajah dengan meme 
Ditambahkan dengan beberapa fitur lainnya

## Screenshots
![Layar Home](https://i.ibb.co/Ny5wvWf/home.jpg)
![Library_cam](https://i.ibb.co/BsqD13k/librarycam.jpg)
![Location](https://i.ibb.co/4NcnLzn/lok.jpg)
![Location](https://i.ibb.co/93GH132/lok2.jpg)
![Meme](https://i.ibb.co/ZLWf9ZX/meme.jpg)
![Media](https://i.ibb.co/qJs4TD2/video.jpg)
![Widget](https://i.ibb.co/f1CLk19/wijet.jpg)

# Requirement (Android OS and level)
 minSdkVersion yang digunakan 15 
 
# List class yang ada & deskripsi singkatnya
ResepListFragment.java
Kelas ini berfungsi menghandle listview dari kelas object statis yakni MainActivity.java
DetailActivity.java
Kelas yang berfungsi untuk memparsing data dari List activity untuk di proses pada detail fragment.
ResepDetailFragment.java
Class yang menghandle Data detail dari fragment 
MyNotificationManager.java
Kelas ini berfungsi untuk membuat notification pesan
Emojifier.java
Kelas yang digunakan untuk deteksi wajah dan pengganti wajah yang terdeteksi dengan gambar dengan parsing gambar dinamis sesuai pilihannya
Resep.java
Kelas yang terdapat isi dari fragment list dan detailnya 
MainActivity.java
Class yang menampilkan fragment list dan detail
Main2Activity.java
Class yang digunakan untuk mengambil picture dan penggunaan library
Main3Activity.java
Class yang digunakan untuk penggunaan media
Main4Activity.java
Class yang digunakan untuk location
DapatkanAlamatTask.java
Class yang digunakan untuk menambatkan alamat geocode longitude dan latitude
MyFirebaseMessageService.java
Kelas ini berfungsi untum mengambil data JSON untuk selanjutnya diparsing ke kelas MyNotificationManager.java
HomeScreen.java
kelas pertama yang akan muncul (halaman home)
NewAppWidget.java
Class yang digunakan untuk menjalankan widget
SinetronModel.java
Class yang digunakan untuk memanggil video dari raw

# Lisensi
/*
* Copyright (C) 2017 The Android Open Source Project
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
