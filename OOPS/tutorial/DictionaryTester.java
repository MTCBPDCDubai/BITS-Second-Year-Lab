import java.util.*;
class Dictionary{
    String word;
        ArrayList<String>meaning;
	    Dictionary(){
	            meaning=new ArrayList<String>();
		        }
			    void add(String means){
			            meaning.add(means);
				        }
					    void add(String wd,String means){
					            word=wd;
						            meaning.add(means);
							        }
								    void change(String rmv,String newm){
								            meaning.remove(rmv);
									            meaning.add(newm);
										        }
											    void display(){
											            System.out.println();
												            System.out.println("Word: "+word);
													            System.out.println("Meaning: ");
														            for(String wd:meaning){
															                System.out.print(wd+'\t');
																	        }
																		        System.out.println();
																			    }
																			    }
																			    class DictionaryTester{
																			        public static void main(String [] args){
																				        ArrayList <Dictionary> dc=new ArrayList<Dictionary>();
																					        Scanner inp=new Scanner(System.in);Scanner inp2=new Scanner(System.in);
																						        int ch=0;
																							        while(ch!=5){
																								            System.out.println("Press 1 to add a word and its meaning");
																									                System.out.println("Press 2 to add a meaning");
																											            System.out.println("Press 3 to change the meaning of a word");
																												                System.out.println("Press 4 to display the meaning of a word");
																														            System.out.println("Press 5 to exit");
																															                ch=inp2.nextInt();
																																	            if(ch==1){
																																		                    System.out.println("----------Enter----------");
																																				                    Dictionary dd=new Dictionary();
																																						                    System.out.print("Enter the word: ");
																																								                    String wd=inp.nextLine();
																																										                    System.out.print("Enter the meaning: ");
																																												                    String mn=inp.nextLine();
																																														                    dd.add(wd,mn);
																																																                    dc.add(dd);
																																																		                }
																																																				            else if(ch==2){
																																																					                    System.out.println("----------Add----------");
																																																							                    System.out.print("Enter the word: ");
																																																									                    String wd=inp.nextLine();
																																																											                    boolean check=true;
																																																													                    for(int i=0;i<dc.size();i++){
																																																															                        if(wd.equalsIgnoreCase(dc.get(i).word)){
																																																																		                        System.out.print("Enter the meaning: ");
																																																																					                        String mn=inp.nextLine();
																																																																								                        dc.get(i).add(mn);
																																																																											                        check=false;break;
																																																																														                    }
																																																																																                    }
																																																																																		                    if(check) System.out.println("Word not found");
																																																																																				                }
																																																																																						            else if(ch==3){
																																																																																							                    System.out.println("----------Edit----------");
																																																																																									                    System.out.print("Enter the word: ");
																																																																																											                    String wd=inp.nextLine();
																																																																																													                    boolean check=true;
																																																																																															                    for(int i=0;i<dc.size();i++){
																																																																																																	                        if(wd.equalsIgnoreCase(dc.get(i).word)){
																																																																																																				                        System.out.print("Enter the old meaning: ");
																																																																																																							                        String rmv=inp.nextLine();
																																																																																																										                        System.out.print("Enter the new meaning: ");
																																																																																																													                        String newm=inp.nextLine();
																																																																																																																                        dc.get(i).change(rmv, newm);
																																																																																																																			                        check=false;break;
																																																																																																																						                    }
																																																																																																																								                    }
																																																																																																																										                    if(check) System.out.println("Word not found");
																																																																																																																												                }
																																																																																																																														            else if(ch==4){
																																																																																																																															                    System.out.println("----------Display----------");
																																																																																																																																	                    System.out.print("Enter the word: ");
																																																																																																																																			                    String wd=inp.nextLine();
																																																																																																																																					                    boolean check=true;
																																																																																																																																							                    for(int i=0;i<dc.size();i++){
																																																																																																																																									                        if(wd.equalsIgnoreCase(dc.get(i).word)){
																																																																																																																																												                        dc.get(i).display();
																																																																																																																																															                        check=false;
																																																																																																																																																		                    }
																																																																																																																																																				                    }
																																																																																																																																																						                    if(check) System.out.println("Word not found");
																																																																																																																																																								                }
																																																																																																																																																										        }
																																																																																																																																																											    }
																																																																																																																																																											    }
