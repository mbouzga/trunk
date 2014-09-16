package com.intercepteurs;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class InscriptionEtudiantInterceptor implements Interceptor {

    public void destroy() {
        System.out.println("Destruction de l'intercepteur d'inscription des etudianst ... ");
    }

    public void init() {
        System.out.println("Initialisation de l'intercepteur d'inscription des etudianst ... ");
    }

    public String intercept(final ActionInvocation invocation) throws Exception {

        // Dans cette partie on ecrit le traitement a effectuer AVANT l'invocation de notre action
        System.out.println("Traitement AVANT l'execution de l'action � intercepter");
        // Fin du traitement AVANT l'execution de l'action

        // On d�clenche l'action intercept�
        invocation.invoke();

        // Dans cette partie on ecrit le traitement a effectuer APRES l'invocation de notre action
        System.out.println("Traitement APRES l'execution de l'action � intercepter");
        // Fin du traitement APRES l'execution de l'action

        return null;
    }

}
