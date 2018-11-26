<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_service or gig details</name>
   <tag></tag>
   <elementGuidId>a4d814a9-54b7-4baf-8ed0-cca29677ece1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>section</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                
                    
                      service or gig details
                     Listing #5
                
                
                
                    
                        Product Name
                    
                    
                        
                        This is your Service or Gig's title. Make it clear and specific to what you are offering 
(ex. &quot;Whole house cleaning&quot; or &quot;Remove Kitchen Cabinets&quot;)  
                    
                

                 
                    
                        Category
                    
                    
                                                Please SelectAssemblyCraftsmen LevelHousehold TaskSkilled Professional
                        
                            Household Task-Task that anyone can pick up such as snow removal, cleaning, assembling furniture.

                            Skilled Professionals-Great at flooring, electrical, Kitchen remodel, tiles, pest control, etc.

                            Craftsmen-True artisans work such as wainscoting or antiqueentry door
                        
                    
                

                
                    
                        Tags
                    
                    
                        
                         
                        
                        
                            How people can search for your products. Separate each tag by a comma.
                        
                    
                
                    About this service or gig
                  
                    
                        Detailed description of the serivce
                    
                    
                       

        

                        
                            Make your description as clear and detailed as possible. This is your chance to not only sell your service or gig but to sell yourself. Optimal amount of words: 80-100 words 
                            DO NOT INCLUDE PERSONAL INFORMATION SUCH AS EMAIL ADDRESS OR PHONE NUMBERS
                        
                    
                


                 
                    
                        Total Price
                    
                    
                        
                        
                            Total price you want to charge the customer for services (labor and material)
                        
                    
                


                  
                    
                        Materials provided in the price
                    
                    
                          
                    
                


                

                  
                     
                            How far are you willing to travel for a service or gig
                     
                            
                                 
                                    
                                                                                Miles willing to travel?2 Miles3 Miles4 Miles5 Miles10 Miles20 Miles30 Miles40 Miles50 Miles60 Miles80 Miles100 Miles

                                    
                                
                                Customers will be able to book your services if they live within the radius you are willing to travel
                            
                        


                    
                            
                                Enter Location
                            
                            
                                
                                            
                                            
                                            
                                            
                                            
                                                var autocomplete = new google.maps.places.Autocomplete(jQuery(&quot;#where_located&quot;)[0], {});
                                                google.maps.event.addListener(autocomplete, 'place_changed', function() {
                                                    var place = autocomplete.getPlace();
                                                    //console.log(place.address_components);
                                                });
                                            
                                            
                                                function cordinate1()
                                                {
                                                    geocoder = new google.maps.Geocoder(); // creating a new geocode object
                                                    address1 = document.getElementById(&quot;where_located&quot;).value;
                                                    if (geocoder)
                                                    {
                                                        geocoder.geocode( { 'address': address1}, function(results, status)
                                                        {
                                                            if (status == google.maps.GeocoderStatus.OK)
                                                            {
                                                                //location of first address (latitude + longitude)
                                                                var location1 = results[0].geometry.location;
                                                                document.getElementById(&quot;cord&quot;).value = location1;

                                                            } else
                                                            {
                                                                document.getElementById(&quot;cord&quot;).value = '';
                                                                //alert(&quot;Geocode was not successful for the following reason: &quot; + status);
                                                            }
                                                        });

                                                    }//end of If

                                                }
                                            
                                

                                &quot;Customers will be able to book your services if they live within the radius you are willing to travel

                            
                    
                

                 
                    
                        How many hours does it take to complete?
                    
                    
                        
                        
                            Use an estimated project duration time Note: This will be used to block your calender if someone books your service or gig and be listed in your listing
                        
                    
                


                 
                    
                        
                        Enter email of someone who can recommend your work
                    
                    
                        
                        
                            Enter email of someone who can recommend your work, we will send them a request to post a review of your work
                        
                    
                


              
                
                
                     
                          Listing #5
                        Add more photos
                        
                    
                    
                    
                        
                            Photos need to showcase your service or gig.
                            Photo Guidelines
                            1.) The more pictures the better

                                2.) Before and after photos work the best. 

                                3.)Your primary photo should be a picture of your finished work  

                                4.) Make sure your photos are clear and high resolution.

                                5.) Photos should display your work and be original 

                                6.) Do not use pictures of yourself 

                                7.)DO NOT INCLUDE PERSONAL INFORMATION SUCH AS EMAIL ADDRESS OR PHONE NUMBERS
                        
                        
                            

                                
                                    Primary
                                    
                                    
                                    add photo
                                    
                                


                                 
                                    
                                    Rotate Image
                                

                                
                                
                                
                            
                            
                            
                                
                                    
                                    
                                    add photo
                                    
                                

                                 
                                    
                                    Rotate Image
                                


                                
                                
                                
                            



                            
                                
                                    
                                    
                                    add photo
                                   
                                
                                 
                                    
                                    Rotate Image
                                

                                
                                
                                
                            
                        
                    
                
               
            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;addlist&quot;)/div[@class=&quot;section&quot;]</value>
   </webElementProperties>
</WebElementEntity>
