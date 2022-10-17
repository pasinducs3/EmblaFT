<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Top Line Section                      _709d2e</name>
   <tag></tag>
   <elementGuidId>18dd23ca-51de-469a-8211-adfa20adc147</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>93180926-4839-420a-9878-f88869c30354</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

    
    Top Line Section

    
    

        
        

            
                    
                            
                                Eranga  Rajapaksha
                            
                            Medlem til 13. feb 2027
                        Logg ut
                    



            
            
            
                
                    Hjem
                    Medlemskap
                    Nyhetsarkiv
                    
                    Kontakt

                    Kjøp nå

                    
                        Versjon 10
                
            

            
            
            SharedResources.MLLogo
            
            
            

        
        
    

    



    $(document).ready(function () {
        $('#sideShoppingCartdiv').load('/webshop/InvoiceTableSide');
    });




    
        
            SIKKERHETSKOPI
        
    



    free Space
    




    
    
        

            

                    

                


                    
                        
                            Embla Norsk Familiehistorie
                        
                            Versjon 10
                        Min profil
                        Mine produkt
                        Ofte stilte spørsmål
                        Brukerstøtte
                        Forum
                            Embla brukergrupper
                            Nyheter
                            Sikkerhetskopi
                            Nedlastinger
                    
                    
                    

                
                
                free Space
                
                

            
        

        


    $(document).ready(function () {
        $(&quot;#msgBox&quot;).hide();
        $('#btnDelete').click(function () {
            $(&quot;#msgBox&quot;).show();
        });
        var action = null;

        $('#btnNo').click(function () {
            location.reload();
        });

        //$('#btnOk').click(function () {
        //    location.reload();
        //});

        $('#btnYes').click(function () {
            $(&quot;#backup&quot;).submit();
        });


        $('.checkBoxList').click(function () {
            if ($('.chkBox').is(&quot;:checked&quot;)) {
                $(&quot;#deleteBtn&quot;).attr('style', &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:visible;&quot;);
            }

            else {
                $(&quot;#deleteBtn&quot;).attr('style', &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:hidden;&quot;);
            }
        });
    });



    
        SIKKERHETSKOPI


        
                Tabellen viser dine sikkerhetskopier av Embla Familie og Slekt som er lagret på datamaskinen til Norsk Familiehistorie på internett. Ved å markere en sikkerhetskopi helt til venstre i tabellen er det mulig å slette sikkerhetskopien ved å klikke på slette-knappen som blir synlig helt nederst i tabellen. 
                
                
                    
                        
                            
                                Sikkerhetskopi 
                                Størrelse 
                                Dato 
                            
                            
                            

                            
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Odd Nielsen 1_with_multimedia_20210325.zip
                                        
                                            
                                        
                                        
                                                329 MB  
                                        
                                        
                                            19. apr 2021
                                        
                                    
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Øystein Haaland sitt familietre_with_multimedia_20150627.zip
                                        
                                            
                                        
                                        
                                                17 MB  
                                        
                                        
                                            18. nov 2020
                                        
                                    
                        
                    
                
            
           
        
        



                         



    
        
    




    LAST OPP DIN SIKKERHETSKOPI
        
            
                Du kan nå laste opp sikkerhetskopien fra Embla Familie og Slekt som du har lagret på din PC. Sjekk aller først at navnet på filen har følgende format: Restore_&lt;navn på familietreet>_&lt;dato>.zip og Restore_&lt;navn på familietreet>_multimedia _&lt;dato>.zip  dette er viktig. Trykk på knappen ‘Velg fil’ og finn den riktige filen før du trykker på ‘Last opp’. Det kan ta litt tid før filen kommer opp, hvis du ombestemmer deg og velger en annen fil vent tiden det tar for programmet til å bytte fil. Har du har et stort familietre kan det ta litt tid å laste opp så da er det bare å smøre seg med tålmodighet.                 
        
    
        
    
        Velg fil
        
    
    
         
        
        
    
        Last opp        
    



    function $id(id) {
        return document.getElementById(id);
    }

    function setFile() {
        $id(&quot;progressTxt&quot;).innerHTML = &quot;&quot;;
        $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;

        $id(&quot;uploadFileName&quot;).innerHTML = &quot;&quot;;
        if ($id('file').files.length &lt; 1) return;
        $id(&quot;uploadFileName&quot;).innerHTML = $id('file').files[0].name;

        
    }

    // upload JPEG files
    function uploadFile() {

        try {

        
            if ($id('file').files.length &lt; 1) return;

            file = $id('file').files[0];

            var xhr = new XMLHttpRequest();
            if (!xhr.upload) {
                alert(&quot;Nettleseren klarer ikke laste opp sikkerhetskopien, vennligst prøv en annen nettleser&quot;);
                return;
            }

        
            var filePattern = /^Restore_(.+?)(_CopyrightGjævenes2014)?(_with_multimedia)?_(\d+).(zip)$/g;
            var matched = filePattern.exec(file.name);
        
            if (matched == null) {
                // Show error message
                alert(&quot;Ugyldig fil eller format, pass på at sikkerhetskopien har riktig navn&quot;);
                return;
            }

            if (matched[5].toUpperCase() != &quot;ZIP&quot;) {
                alert(&quot;Vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }

            if (matched[2] != null ) {
                alert(&quot;Denne filen er ugyldig, vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }
        
            // Cant click upload during uploading
            $id('btnUpload').style.pointerEvents = 'none';
            $id('file').disabled = true;

            // create progress bar
            var progressTxt = $id(&quot;progressTxt&quot;);
            var progressPer = $id(&quot;progressPer&quot;);
            progressTxt.innerHTML = &quot;upload &quot; + file.name;


                // progress bar
                xhr.upload.addEventListener(&quot;progress&quot;, function (e) {
                    var pc = parseInt(e.loaded / e.total * 100);
                    progressTxt.innerHTML = pc + &quot;%&quot;;
                    progressPer.style.width = (e.loaded / e.total) * 500 + &quot;px&quot;;
                }, false);

                // file received/failed
                xhr.onreadystatechange = function (e) {
                    if (xhr.readyState == 4) {
                        
                        $id('btnUpload').style.pointerEvents = 'auto';
                        $id('file').disabled = false;

                        if (xhr.status == 200) {

                            // Check if JSON error
                            var response = xhr.responseText.slice(1, -1);
                            if (response != &quot;&quot;) {
                                progressTxt.innerHTML = response;
                                return;
                            }
                            progressTxt.innerHTML = &quot;Gjennomført&quot;;
                            location.reload();

                        } else {
                            progressTxt.innerHTML = &quot;Feilet&quot;;
                        }
                    }
                };

                // start upload
                xhr.open(&quot;POST&quot;, &quot;/Backup/Upload&quot;, true);
                xhr.overrideMimeType(&quot;multipart/form-data&quot;)
                xhr.setRequestHeader(&quot;X_FILENAME&quot;, file.name);
                var fd = new FormData();
                fd.append('file', file);
                xhr.send(fd);

        } catch (e) {
            // Reset
            $id(&quot;progressTxt&quot;).innerHTML = &quot;Beklager, det oppstod et problem under opplastningen av sikkerhetskopien&quot;;
            $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;
        }
    }











    $(document).ready(function () {
        $('#btnOk').live('click', function () {            
            $('#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag').remove();           
            var okRef = &quot;&quot;;   //$('#inpOkRef').attr('value');
            //$('#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag').css(&quot;visibility&quot;, &quot;hidden&quot;);
            
            if (okRef) {
                window.location.href = okRef;
            }
        });

        $('#btnYes').live('click', function () {
            $('#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag').css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var yesRef = $('#inpYesRef').attr('value');
            var yesRef = &quot;&quot;;//$('#inpYesRef').attr('value');
            if (yesRef) {
                window.location.href = yesRef;
            }
        });

        $('#btnNo').live('click', function () {
            $('#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag').css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var noRef = $('#inpNoRef').attr('value');
            var noRef = &quot;&quot;;
            if (noRef) {
                window.location.href = noRef;
            }
        });

    });



    
        
            
            
            
                 Informasjon 
			
            

            
            
                Ønsker du å slette sikkerhetskopi?
            
            
                                                               
            
            
                
                             
                                 
                             
                             
                                 
                             

          
                
           
           
           
        







    

    
    free Space




    

    
        

              

            
            

                
                    
                        Copyright ©
                        Embla Norsk Familiehistorie AS, Med enerett
                    
                    
                
                Personvernerklæring

            
            
            

             
        
    

    



/html[1]/body[1]</value>
      <webElementGuid>7f9a898b-edbd-4c1a-8446-9b9fd5291fbf</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]</value>
      <webElementGuid>e2e7579b-e7cc-4946-81b5-03d54d6c229b</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>b74630a2-aa0d-4d38-9726-509db17e738d</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;

    
    Top Line Section

    
    

        
        

            
                    
                            
                                Eranga  Rajapaksha
                            
                            Medlem til 13. feb 2027
                        Logg ut
                    



            
            
            
                
                    Hjem
                    Medlemskap
                    Nyhetsarkiv
                    
                    Kontakt

                    Kjøp nå

                    
                        Versjon 10
                
            

            
            
            SharedResources.MLLogo
            
            
            

        
        
    

    



    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#sideShoppingCartdiv&quot; , &quot;'&quot; , &quot;).load(&quot; , &quot;'&quot; , &quot;/webshop/InvoiceTableSide&quot; , &quot;'&quot; , &quot;);
    });




    
        
            SIKKERHETSKOPI
        
    



    free Space
    




    
    
        

            

                    

                


                    
                        
                            Embla Norsk Familiehistorie
                        
                            Versjon 10
                        Min profil
                        Mine produkt
                        Ofte stilte spørsmål
                        Brukerstøtte
                        Forum
                            Embla brukergrupper
                            Nyheter
                            Sikkerhetskopi
                            Nedlastinger
                    
                    
                    

                
                
                free Space
                
                

            
        

        


    $(document).ready(function () {
        $(&quot;#msgBox&quot;).hide();
        $(&quot; , &quot;'&quot; , &quot;#btnDelete&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot;#msgBox&quot;).show();
        });
        var action = null;

        $(&quot; , &quot;'&quot; , &quot;#btnNo&quot; , &quot;'&quot; , &quot;).click(function () {
            location.reload();
        });

        //$(&quot; , &quot;'&quot; , &quot;#btnOk&quot; , &quot;'&quot; , &quot;).click(function () {
        //    location.reload();
        //});

        $(&quot; , &quot;'&quot; , &quot;#btnYes&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot;#backup&quot;).submit();
        });


        $(&quot; , &quot;'&quot; , &quot;.checkBoxList&quot; , &quot;'&quot; , &quot;).click(function () {
            if ($(&quot; , &quot;'&quot; , &quot;.chkBox&quot; , &quot;'&quot; , &quot;).is(&quot;:checked&quot;)) {
                $(&quot;#deleteBtn&quot;).attr(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;, &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:visible;&quot;);
            }

            else {
                $(&quot;#deleteBtn&quot;).attr(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;, &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:hidden;&quot;);
            }
        });
    });



    
        SIKKERHETSKOPI


        
                Tabellen viser dine sikkerhetskopier av Embla Familie og Slekt som er lagret på datamaskinen til Norsk Familiehistorie på internett. Ved å markere en sikkerhetskopi helt til venstre i tabellen er det mulig å slette sikkerhetskopien ved å klikke på slette-knappen som blir synlig helt nederst i tabellen. 
                
                
                    
                        
                            
                                Sikkerhetskopi 
                                Størrelse 
                                Dato 
                            
                            
                            

                            
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Odd Nielsen 1_with_multimedia_20210325.zip
                                        
                                            
                                        
                                        
                                                329 MB  
                                        
                                        
                                            19. apr 2021
                                        
                                    
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Øystein Haaland sitt familietre_with_multimedia_20150627.zip
                                        
                                            
                                        
                                        
                                                17 MB  
                                        
                                        
                                            18. nov 2020
                                        
                                    
                        
                    
                
            
           
        
        



                         



    
        
    




    LAST OPP DIN SIKKERHETSKOPI
        
            
                Du kan nå laste opp sikkerhetskopien fra Embla Familie og Slekt som du har lagret på din PC. Sjekk aller først at navnet på filen har følgende format: Restore_&lt;navn på familietreet>_&lt;dato>.zip og Restore_&lt;navn på familietreet>_multimedia _&lt;dato>.zip  dette er viktig. Trykk på knappen ‘Velg fil’ og finn den riktige filen før du trykker på ‘Last opp’. Det kan ta litt tid før filen kommer opp, hvis du ombestemmer deg og velger en annen fil vent tiden det tar for programmet til å bytte fil. Har du har et stort familietre kan det ta litt tid å laste opp så da er det bare å smøre seg med tålmodighet.                 
        
    
        
    
        Velg fil
        
    
    
         
        
        
    
        Last opp        
    



    function $id(id) {
        return document.getElementById(id);
    }

    function setFile() {
        $id(&quot;progressTxt&quot;).innerHTML = &quot;&quot;;
        $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;

        $id(&quot;uploadFileName&quot;).innerHTML = &quot;&quot;;
        if ($id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files.length &lt; 1) return;
        $id(&quot;uploadFileName&quot;).innerHTML = $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files[0].name;

        
    }

    // upload JPEG files
    function uploadFile() {

        try {

        
            if ($id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files.length &lt; 1) return;

            file = $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files[0];

            var xhr = new XMLHttpRequest();
            if (!xhr.upload) {
                alert(&quot;Nettleseren klarer ikke laste opp sikkerhetskopien, vennligst prøv en annen nettleser&quot;);
                return;
            }

        
            var filePattern = /^Restore_(.+?)(_CopyrightGjævenes2014)?(_with_multimedia)?_(\d+).(zip)$/g;
            var matched = filePattern.exec(file.name);
        
            if (matched == null) {
                // Show error message
                alert(&quot;Ugyldig fil eller format, pass på at sikkerhetskopien har riktig navn&quot;);
                return;
            }

            if (matched[5].toUpperCase() != &quot;ZIP&quot;) {
                alert(&quot;Vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }

            if (matched[2] != null ) {
                alert(&quot;Denne filen er ugyldig, vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }
        
            // Cant click upload during uploading
            $id(&quot; , &quot;'&quot; , &quot;btnUpload&quot; , &quot;'&quot; , &quot;).style.pointerEvents = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
            $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).disabled = true;

            // create progress bar
            var progressTxt = $id(&quot;progressTxt&quot;);
            var progressPer = $id(&quot;progressPer&quot;);
            progressTxt.innerHTML = &quot;upload &quot; + file.name;


                // progress bar
                xhr.upload.addEventListener(&quot;progress&quot;, function (e) {
                    var pc = parseInt(e.loaded / e.total * 100);
                    progressTxt.innerHTML = pc + &quot;%&quot;;
                    progressPer.style.width = (e.loaded / e.total) * 500 + &quot;px&quot;;
                }, false);

                // file received/failed
                xhr.onreadystatechange = function (e) {
                    if (xhr.readyState == 4) {
                        
                        $id(&quot; , &quot;'&quot; , &quot;btnUpload&quot; , &quot;'&quot; , &quot;).style.pointerEvents = &quot; , &quot;'&quot; , &quot;auto&quot; , &quot;'&quot; , &quot;;
                        $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).disabled = false;

                        if (xhr.status == 200) {

                            // Check if JSON error
                            var response = xhr.responseText.slice(1, -1);
                            if (response != &quot;&quot;) {
                                progressTxt.innerHTML = response;
                                return;
                            }
                            progressTxt.innerHTML = &quot;Gjennomført&quot;;
                            location.reload();

                        } else {
                            progressTxt.innerHTML = &quot;Feilet&quot;;
                        }
                    }
                };

                // start upload
                xhr.open(&quot;POST&quot;, &quot;/Backup/Upload&quot;, true);
                xhr.overrideMimeType(&quot;multipart/form-data&quot;)
                xhr.setRequestHeader(&quot;X_FILENAME&quot;, file.name);
                var fd = new FormData();
                fd.append(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;, file);
                xhr.send(fd);

        } catch (e) {
            // Reset
            $id(&quot;progressTxt&quot;).innerHTML = &quot;Beklager, det oppstod et problem under opplastningen av sikkerhetskopien&quot;;
            $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;
        }
    }











    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#btnOk&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {            
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).remove();           
            var okRef = &quot;&quot;;   //$(&quot; , &quot;'&quot; , &quot;#inpOkRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            //$(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            
            if (okRef) {
                window.location.href = okRef;
            }
        });

        $(&quot; , &quot;'&quot; , &quot;#btnYes&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var yesRef = $(&quot; , &quot;'&quot; , &quot;#inpYesRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            var yesRef = &quot;&quot;;//$(&quot; , &quot;'&quot; , &quot;#inpYesRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            if (yesRef) {
                window.location.href = yesRef;
            }
        });

        $(&quot; , &quot;'&quot; , &quot;#btnNo&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var noRef = $(&quot; , &quot;'&quot; , &quot;#inpNoRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            var noRef = &quot;&quot;;
            if (noRef) {
                window.location.href = noRef;
            }
        });

    });



    
        
            
            
            
                 Informasjon 
			
            

            
            
                Ønsker du å slette sikkerhetskopi?
            
            
                                                               
            
            
                
                             
                                 
                             
                             
                                 
                             

          
                
           
           
           
        







    

    
    free Space




    

    
        

              

            
            

                
                    
                        Copyright ©
                        Embla Norsk Familiehistorie AS, Med enerett
                    
                    
                
                Personvernerklæring

            
            
            

             
        
    

    



/html[1]/body[1]&quot;) or . = concat(&quot;

    
    Top Line Section

    
    

        
        

            
                    
                            
                                Eranga  Rajapaksha
                            
                            Medlem til 13. feb 2027
                        Logg ut
                    



            
            
            
                
                    Hjem
                    Medlemskap
                    Nyhetsarkiv
                    
                    Kontakt

                    Kjøp nå

                    
                        Versjon 10
                
            

            
            
            SharedResources.MLLogo
            
            
            

        
        
    

    



    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#sideShoppingCartdiv&quot; , &quot;'&quot; , &quot;).load(&quot; , &quot;'&quot; , &quot;/webshop/InvoiceTableSide&quot; , &quot;'&quot; , &quot;);
    });




    
        
            SIKKERHETSKOPI
        
    



    free Space
    




    
    
        

            

                    

                


                    
                        
                            Embla Norsk Familiehistorie
                        
                            Versjon 10
                        Min profil
                        Mine produkt
                        Ofte stilte spørsmål
                        Brukerstøtte
                        Forum
                            Embla brukergrupper
                            Nyheter
                            Sikkerhetskopi
                            Nedlastinger
                    
                    
                    

                
                
                free Space
                
                

            
        

        


    $(document).ready(function () {
        $(&quot;#msgBox&quot;).hide();
        $(&quot; , &quot;'&quot; , &quot;#btnDelete&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot;#msgBox&quot;).show();
        });
        var action = null;

        $(&quot; , &quot;'&quot; , &quot;#btnNo&quot; , &quot;'&quot; , &quot;).click(function () {
            location.reload();
        });

        //$(&quot; , &quot;'&quot; , &quot;#btnOk&quot; , &quot;'&quot; , &quot;).click(function () {
        //    location.reload();
        //});

        $(&quot; , &quot;'&quot; , &quot;#btnYes&quot; , &quot;'&quot; , &quot;).click(function () {
            $(&quot;#backup&quot;).submit();
        });


        $(&quot; , &quot;'&quot; , &quot;.checkBoxList&quot; , &quot;'&quot; , &quot;).click(function () {
            if ($(&quot; , &quot;'&quot; , &quot;.chkBox&quot; , &quot;'&quot; , &quot;).is(&quot;:checked&quot;)) {
                $(&quot;#deleteBtn&quot;).attr(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;, &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:visible;&quot;);
            }

            else {
                $(&quot;#deleteBtn&quot;).attr(&quot; , &quot;'&quot; , &quot;style&quot; , &quot;'&quot; , &quot;, &quot;margin-right: -3px; margin-top: 80px; display: inline; float: right;visibility:hidden;&quot;);
            }
        });
    });



    
        SIKKERHETSKOPI


        
                Tabellen viser dine sikkerhetskopier av Embla Familie og Slekt som er lagret på datamaskinen til Norsk Familiehistorie på internett. Ved å markere en sikkerhetskopi helt til venstre i tabellen er det mulig å slette sikkerhetskopien ved å klikke på slette-knappen som blir synlig helt nederst i tabellen. 
                
                
                    
                        
                            
                                Sikkerhetskopi 
                                Størrelse 
                                Dato 
                            
                            
                            

                            
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Odd Nielsen 1_with_multimedia_20210325.zip
                                        
                                            
                                        
                                        
                                                329 MB  
                                        
                                        
                                            19. apr 2021
                                        
                                    
                                    
                                        
                                            
                                                
                                                
                                                IRestore_Øystein Haaland sitt familietre_with_multimedia_20150627.zip
                                        
                                            
                                        
                                        
                                                17 MB  
                                        
                                        
                                            18. nov 2020
                                        
                                    
                        
                    
                
            
           
        
        



                         



    
        
    




    LAST OPP DIN SIKKERHETSKOPI
        
            
                Du kan nå laste opp sikkerhetskopien fra Embla Familie og Slekt som du har lagret på din PC. Sjekk aller først at navnet på filen har følgende format: Restore_&lt;navn på familietreet>_&lt;dato>.zip og Restore_&lt;navn på familietreet>_multimedia _&lt;dato>.zip  dette er viktig. Trykk på knappen ‘Velg fil’ og finn den riktige filen før du trykker på ‘Last opp’. Det kan ta litt tid før filen kommer opp, hvis du ombestemmer deg og velger en annen fil vent tiden det tar for programmet til å bytte fil. Har du har et stort familietre kan det ta litt tid å laste opp så da er det bare å smøre seg med tålmodighet.                 
        
    
        
    
        Velg fil
        
    
    
         
        
        
    
        Last opp        
    



    function $id(id) {
        return document.getElementById(id);
    }

    function setFile() {
        $id(&quot;progressTxt&quot;).innerHTML = &quot;&quot;;
        $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;

        $id(&quot;uploadFileName&quot;).innerHTML = &quot;&quot;;
        if ($id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files.length &lt; 1) return;
        $id(&quot;uploadFileName&quot;).innerHTML = $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files[0].name;

        
    }

    // upload JPEG files
    function uploadFile() {

        try {

        
            if ($id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files.length &lt; 1) return;

            file = $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).files[0];

            var xhr = new XMLHttpRequest();
            if (!xhr.upload) {
                alert(&quot;Nettleseren klarer ikke laste opp sikkerhetskopien, vennligst prøv en annen nettleser&quot;);
                return;
            }

        
            var filePattern = /^Restore_(.+?)(_CopyrightGjævenes2014)?(_with_multimedia)?_(\d+).(zip)$/g;
            var matched = filePattern.exec(file.name);
        
            if (matched == null) {
                // Show error message
                alert(&quot;Ugyldig fil eller format, pass på at sikkerhetskopien har riktig navn&quot;);
                return;
            }

            if (matched[5].toUpperCase() != &quot;ZIP&quot;) {
                alert(&quot;Vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }

            if (matched[2] != null ) {
                alert(&quot;Denne filen er ugyldig, vennligst last opp en sikkerhetskopi merket som ZIP fil, laget av Embla Familie og Slekt versjon 9&quot;);
                return;
            }
        
            // Cant click upload during uploading
            $id(&quot; , &quot;'&quot; , &quot;btnUpload&quot; , &quot;'&quot; , &quot;).style.pointerEvents = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
            $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).disabled = true;

            // create progress bar
            var progressTxt = $id(&quot;progressTxt&quot;);
            var progressPer = $id(&quot;progressPer&quot;);
            progressTxt.innerHTML = &quot;upload &quot; + file.name;


                // progress bar
                xhr.upload.addEventListener(&quot;progress&quot;, function (e) {
                    var pc = parseInt(e.loaded / e.total * 100);
                    progressTxt.innerHTML = pc + &quot;%&quot;;
                    progressPer.style.width = (e.loaded / e.total) * 500 + &quot;px&quot;;
                }, false);

                // file received/failed
                xhr.onreadystatechange = function (e) {
                    if (xhr.readyState == 4) {
                        
                        $id(&quot; , &quot;'&quot; , &quot;btnUpload&quot; , &quot;'&quot; , &quot;).style.pointerEvents = &quot; , &quot;'&quot; , &quot;auto&quot; , &quot;'&quot; , &quot;;
                        $id(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;).disabled = false;

                        if (xhr.status == 200) {

                            // Check if JSON error
                            var response = xhr.responseText.slice(1, -1);
                            if (response != &quot;&quot;) {
                                progressTxt.innerHTML = response;
                                return;
                            }
                            progressTxt.innerHTML = &quot;Gjennomført&quot;;
                            location.reload();

                        } else {
                            progressTxt.innerHTML = &quot;Feilet&quot;;
                        }
                    }
                };

                // start upload
                xhr.open(&quot;POST&quot;, &quot;/Backup/Upload&quot;, true);
                xhr.overrideMimeType(&quot;multipart/form-data&quot;)
                xhr.setRequestHeader(&quot;X_FILENAME&quot;, file.name);
                var fd = new FormData();
                fd.append(&quot; , &quot;'&quot; , &quot;file&quot; , &quot;'&quot; , &quot;, file);
                xhr.send(fd);

        } catch (e) {
            // Reset
            $id(&quot;progressTxt&quot;).innerHTML = &quot;Beklager, det oppstod et problem under opplastningen av sikkerhetskopien&quot;;
            $id(&quot;progressPer&quot;).style.width = &quot;0px&quot;;
        }
    }











    $(document).ready(function () {
        $(&quot; , &quot;'&quot; , &quot;#btnOk&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {            
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).remove();           
            var okRef = &quot;&quot;;   //$(&quot; , &quot;'&quot; , &quot;#inpOkRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            //$(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            
            if (okRef) {
                window.location.href = okRef;
            }
        });

        $(&quot; , &quot;'&quot; , &quot;#btnYes&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var yesRef = $(&quot; , &quot;'&quot; , &quot;#inpYesRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            var yesRef = &quot;&quot;;//$(&quot; , &quot;'&quot; , &quot;#inpYesRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            if (yesRef) {
                window.location.href = yesRef;
            }
        });

        $(&quot; , &quot;'&quot; , &quot;#btnNo&quot; , &quot;'&quot; , &quot;).live(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function () {
            $(&quot; , &quot;'&quot; , &quot;#EMBLA_util_ConfirmationPanel_confirmation_box_Main_Tag&quot; , &quot;'&quot; , &quot;).css(&quot;visibility&quot;, &quot;hidden&quot;);
            //var noRef = $(&quot; , &quot;'&quot; , &quot;#inpNoRef&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;value&quot; , &quot;'&quot; , &quot;);
            var noRef = &quot;&quot;;
            if (noRef) {
                window.location.href = noRef;
            }
        });

    });



    
        
            
            
            
                 Informasjon 
			
            

            
            
                Ønsker du å slette sikkerhetskopi?
            
            
                                                               
            
            
                
                             
                                 
                             
                             
                                 
                             

          
                
           
           
           
        







    

    
    free Space




    

    
        

              

            
            

                
                    
                        Copyright ©
                        Embla Norsk Familiehistorie AS, Med enerett
                    
                    
                
                Personvernerklæring

            
            
            

             
        
    

    



/html[1]/body[1]&quot;))]</value>
      <webElementGuid>a0bcc0cb-9c67-48b3-8dc4-0875a4040fc6</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
