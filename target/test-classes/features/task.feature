#HW 1 Ahmet hoca:
#
#Kullanici https://www.krafttechexlab.com/login Links to an external site.adresine gider.
#Gecerli kullanici kriterleri ile giris yapar.
#Kullanici sayfanin en ust sag tarafinda yer alan Dashboard, Developers Edit Profile ve login olan Kullanicinin adinin yazili oldugu basliklari gorur.
#(Not: List kullanarak yapilacak)
#
#HW 2
#
#Kullanici https://www.krafttechexlab.com/login Links to an external site.adresine gider.
#Gecerli kullanici kriterleri ile giris yapar.
#MY Profile altinda bulunan Add Experience modulune gider.
#Ilgili kutulari doldurur.
#Add Experience button click eder.
#Overview modulune dondugunu verify eder.


Feature: Module Test

  Scenario: Module test with different user
    Given User should be on the login page
    When User should input "alp@gmail.com" and "12345678"
    Then User should see profile options and username
      | Dashboard    |
      | Developers   |
      | Edit Profile |
      | Alparslan    |

  @moduleTest
    Scenario: Add Experience Modul Test
      Given User should be on the login page
      When User should input "alp@gmail.com" and "12345678"
      And User should go to My Profile
      And User should go to "Add Experience" modul
      And User should input information and click Add Experience Button
      Then User should see Overview module


