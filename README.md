# EasyExpenseApp – Kişisel Gelir ve Gider Takip Uygulaması

## Proje Tanımı
EasyExpenseApp, günlük gelir ve giderlerini tek bir yerden kolayca takip etmek isteyen bireyler için geliştirilmiş web tabanlı bir kişisel finans uygulamasıdır. Kullanıcıların karmaşık tablolara ihtiyaç duymadan anlık nakit akışlarını kaydetmelerini ve güncel bakiyelerini görmelerini sağlar.

## Kullanılan Teknolojiler
- Java 21
- Spring Boot (Spring Web, Spring Data JPA, Validation)
- H2 In-Memory Database
- HTML5 / CSS3 / Vanilla JavaScript
- Maven

## Proje Yönetim Panosu
GitHub Projects Panosu: [https://github.com/users/hclrossii/projects/1]

Pano **Yapılacak**, **Devam Ediyor** ve **Tamamlandı** olmak üzere üç sütundan oluşmaktadır.

## Kurulum ve Çalıştırma Adımları
1. Depoyu bilgisayarınıza klonlayın:

```bash
   git clone https://github.com/hclrossii/EasyExpenseApp.git
```
2. Proje dizinine girin:
```bash
   cd EasyExpenseApp
```
3. Uygulamayı Maven ile çalıştırın:
```bash
   ./mvnw spring-boot:run
```

## Tamamlanan Özellikler ve Test Senaryoları

### Özellik 1: Gelir ve Gider Ekleme & Listeleme
1. Tarayıcıda `http://localhost:8080` adresini açın.
2. **Yeni İşlem Ekle** formundan tür olarak **Gelir (Income)**, tutar olarak `20000`, açıklama olarak `Maaş` girip **Ekle** butonuna basın.
3. Ardından tür olarak **Gider (Expense)**, tutar olarak `5000`, açıklama olarak `Kira` girip **Ekle** butonuna basın.
4. Sayfanın altındaki **İşlem Geçmişi** tablosunda her iki kaydın tarih ve tür etiketleriyle listelendiğini doğrulayın.

### Özellik 2: Otomatik Bakiye Hesaplama
1. Yukarıdaki 20.000 TL gelir ve 5.000 TL gider işlemlerini ekledikten sonra sayfanın üst kısmındaki özet kartlarını kontrol edin.
2. Aşağıdaki değerlerin otomatik hesaplandığını doğrulayın:
    - **Toplam Gelir:** `20000.00 TL`
    - **Toplam Gider:** `5000.00 TL`
    - **Mevcut Bakiye:** `15000.00 TL`
### Özellik 3: İşlem Türüne Göre Filtreleme
1. Gelir ve gider kayıtları eklendikten sonra **İşlem Geçmişi** başlığının sağındaki **Sadece Gelirler** butonuna basın; tabloda yalnızca gelir kayıtlarının listelendiğini doğrulayın.
2. **Sadece Giderler** butonuna basarak yalnızca giderlerin listelendiğini, **Tümü** butonuna basarak tüm kayıtların geri geldiğini doğrulayın.