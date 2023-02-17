package com.noelchew.permisowrapper.demo.permissions;

import android.content.Context;
import android.widget.Toast;

import com.noelchew.permisowrapper.PermisoWrapper;

/**
 * Created by noelchew on 05/08/2016.
 */
public class GetPermissionArrayList {
    public static GetPermission[] getPermissionArrayList(final Context context) {
        GetPermission[] getPermissions = new GetPermission[]{
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionPickFolderFile(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to pick folder and file GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to pick folder and file DENIED.");
                            }
                        });
                    }
                }, new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionScanQRCode(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to scan QR code GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to scan QR code DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionPickPictureVideo(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to pick picture and video GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to pick picture and video DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionTakePicture(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to take picture GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to take picture DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionTakeVideo(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to take video GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to take video DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionPickAudio(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to pick audio file GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to pick audio file DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionRecordVoice(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to record voice GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to record voice DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionVoiceMessage(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to send voice message GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to send voice message DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionVoiceCall(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to make voice call GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to make voice call DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionVideoCall(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to make video call GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to make video call DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionShareLocation(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to share location GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to share location DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionLocateUser(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to locate user GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to locate user DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAutoFillAreaCode(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to autofill area code GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to autofill area code DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAccessContacts(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to access contacts GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to access contacts DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionRecommendNewFriends(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to recommend new friends GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to recommend new friends DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionSaveMediaToStorage(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to save media to storage GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to save media to storage DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionSaveContentToStorage(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to save content to storage GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to save content to storage DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAccessCalendar(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to access calendar GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to access calendar DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAccessPhoneFeatures(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to access phone features GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to access phone features DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionGetPhoneNumber(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to get phone number GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to get phone number DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionMakePhoneCall(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to make phone call GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to make phone call DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAnswerPhoneCall(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to answer phone call GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to answer phone call DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAccessSMS(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to access SMS GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to access SMS DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionSendSMS(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to send SMS GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to send SMS DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionReadSMS(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to read SMS GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to read SMS DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionAccessPhoneSensors(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to access phone sensors GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to access phone sensors DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionScanSurroundingAndConnectBLE(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to scan and connect surrounding BLE GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to scan and connect surrounding BLE DENIED.");
                            }
                        });
                    }
                },
                new GetPermission() {
                    @Override
                    public void get() {
                        PermisoWrapper.getPermissionReceiveNotification(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                toast(context, "Permission to receive notifications GRANTED. Do something here.");
                            }

                            @Override
                            public void onPermissionDenied() {
                                toast(context, "Permission to receive notifications DENIED.");
                            }
                        });
                    }
                }

        };

        return getPermissions;
    }


    private static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
