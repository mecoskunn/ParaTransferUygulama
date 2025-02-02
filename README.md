# ParaTransferUygulama

![Para Transfer Uygulaması](https://img.shields.io/badge/Para%20Transfer-Uygulama-blue)

ParaTransferUygulama, kullanıcıların farklı hesaplar arasında para transferi yapmalarını sağlayan bir **bankacılık simülasyonu** uygulamasıdır. Güvenli ve hızlı para transferi işlemlerini destekler.

## 🚀 Özellikler

✅ **Hesap Yönetimi** – Yeni hesap oluşturma ve yönetme imkanı.  
✅ **Para Transferi** – Hesaplar arası güvenli para transferi.  
✅ **Bakiye Sorgulama** – Mevcut hesap bakiyelerini görüntüleme.  
✅ **İşlem Geçmişi** – Yapılan transferlerin geçmişini kaydetme ve inceleme.

---

## 🛠️ Kurulum

### 1️⃣ Depoyu Klonlayın

```bash
git clone https://github.com/mecoskunn/ParaTransferUygulama.git
cd ParaTransferUygulama
```

### 2️⃣ Bağımlılıkları Yükleyin

Maven kullanarak proje bağımlılıklarını yükleyin:

```bash
mvn clean install
```

### 3️⃣ Veritabanı Yapılandırması

Projede **MySQL** veritabanı kullanılıyorsa `application.properties` dosyanızı uygun şekilde düzenleyin:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/para_transfer
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 4️⃣ Uygulamayı Başlatın

```bash
mvn spring-boot:run
```

Uygulama varsayılan olarak `http://localhost:8080` adresinde çalışacaktır.

---

## 📌 Kullanım

1. **Hesap Oluşturma:** "Hesap Oluştur" sekmesine giderek yeni bir hesap açabilirsiniz.
2. **Para Transferi:** Gönderen ve alıcı hesap bilgilerini girerek transfer işlemi yapabilirsiniz.
3. **Bakiye Sorgulama:** "Hesaplarım" sekmesinde hesap bakiyenizi görüntüleyebilirsiniz.
4. **İşlem Geçmişi:** Tüm transferlerinizi "İşlem Geçmişi" sekmesinden inceleyebilirsiniz.

---

## 🤝 Katkıda Bulunma

Katkılarınızı memnuniyetle karşılıyoruz! Projeye katkıda bulunmak için şu adımları takip edebilirsiniz:

1. **Projeyi Fork Edin**
2. **Yeni Bir Branch Açın** (`feature/ozellik-adi` şeklinde):
   ```bash
   git checkout -b feature/yeni-ozellik
   ```
3. **Değişikliklerinizi Yapın ve Commit Edin:**
   ```bash
   git commit -m "Yeni özellik eklendi"
   ```
4. **Branch’i Push Edin:**
   ```bash
   git push origin feature/yeni-ozellik
   ```
5. **Pull Request Açın**

---

## 📜 Lisans

Bu proje **MIT Lisansı** ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakabilirsiniz.

---

## 📩 İletişim

Herhangi bir sorunuz veya geri bildiriminiz için [mecoskunn](https://github.com/mecoskunn) ile iletişime geçebilirsiniz.

🎉 **Destek olmak için projeyi ⭐️ verin!**

