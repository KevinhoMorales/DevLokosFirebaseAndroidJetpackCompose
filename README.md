# DevLokosFirebaseAndroidJetpackCompose

# 📒 DevLokos Firebase Notes App

Una aplicación sencilla de **notas personales** desarrollada con **Android + Jetpack Compose + Firebase**, ideal para aprender los fundamentos de Firestore, arquitectura MVVM y UI moderna.


<img src="https://i.ibb.co/zhSYHLgd/Screenshot-1744671189.png" alt="Demo" width="300" height="auto"/>

---
## 🚀 Características

- ✅ Creación de notas con título y contenido  
- ✅ Visualización en tiempo real desde Firestore  
- ✅ Arquitectura limpia usando MVVM  
- ✅ Interfaz construida 100% con Jetpack Compose  
- ✅ Conexión segura y eficiente con Firebase Firestore  

---

## 🧱 Tecnologías utilizadas

- Kotlin  
- Jetpack Compose  
- Firebase Firestore  
- Firebase BoM (Bill of Materials)  
- StateFlow + ViewModel  
- Android Studio Giraffe o superior  

---

## 📦 Estructura del proyecto

```json
app/
├─ note/
│   ├─ view/             → Pantalla principal NoteScreen.kt
│   ├─ viewmodel/        → Lógica NoteViewModel.kt
│   ├─ model/            → Clase Note.kt
│   └─ repository/       → Acceso a Firestore NoteRepository.kt
└─ MainActivity.kt
```
---

## 🔧 Configuración inicial

Clona este repositorio:

   git clone https://github.com/tu_usuario/firebase-notes-app.git

---

## 📁 Ruta del archivo de configuración

Ubica el archivo de configuración de Firebase en la siguiente ruta
app/google-services.json

---

## 📦 Dependencias necesarias en `build.gradle (app)`

```kotlin
implementation platform("com.google.firebase:firebase-bom:32.7.0")
implementation("com.google.firebase:firebase-firestore")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose")
implementation("androidx.lifecycle:lifecycle-runtime-ktx")

apply plugin: 'com.google.gms.google-services'
```
```json
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /notes/{document} {
      allow read, write: if true; // ¡Solo para desarrollo!
    }
  }
}
```
---

## 📱 Funcionamiento

- Al iniciar, se cargan todas las notas existentes desde Firestore  
- Puedes ingresar un título y contenido de nota y guardarla  
- Las notas aparecen al instante en una lista tipo tarjeta  
- Puedes actualizar una nota seleccionándola y editándola  
- El diseño es limpio, adaptado con Material 3 y Compose  

---

## 📩 Contribuciones

¿Quieres mejorar algo?  
¡Las contribuciones, sugerencias o pull requests son bienvenidas!  
Solo recuerda mantener el estilo del proyecto.

---

## 🧑‍💻 Autor

**Kevinho Morales**  
📲 Android & iOS Developer  
🎙️ Creador de [DevLokos Podcast](https://www.instagram.com/devlokos)  
🌐 [www.devlokos.com](https://www.devlokos.com)

---

## ⭐ Licencia

Este proyecto está bajo la licencia MIT.  
Consulta el archivo `LICENSE` para más detalles.
