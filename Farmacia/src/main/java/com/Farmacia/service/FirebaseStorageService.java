
package com.Farmacia.service;

import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "farmacia-2e2b0.appspot.com";

    //Esta es la ruta básica de este proyecto farmacia
    final String rutaSuperiorStorage = "farmacia";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "farmacia-2e2b0-firebase-adminsdk-u1vaq-c4f008aaa5.json";
}