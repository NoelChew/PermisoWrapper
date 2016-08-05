package com.noelchew.permisowrapper.demo;

import android.content.Context;
import android.widget.Toast;

import com.noelchew.permisowrapper.PermissionUtil;

/**
 * Created by aio-synergy on 05/08/2016.
 */
public class GetPermissionArrayData {
    public static GetPermission[] getPermissionArrayData(final Context context) {
        GetPermission[] getPermissions = new GetPermission[]{
                new GetPermission() {
                    @Override
                    public void get() {
                        PermissionUtil.getPermissionPickPictureVideo(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionTakePicture(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionTakeVideo(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionVoiceMessage(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionVoiceCall(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionVideoCall(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionShareLocation(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionLocateUser(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAutoFillAreaCode(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAccessContacts(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionRecommendNewFriends(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionSaveMediaToStorage(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionSaveContentToStorage(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAccessCalendar(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAccessPhoneFeatures(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionGetPhoneNumber(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionMakePhoneCall(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAccessSMS(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionSendSMS(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionReadSMS(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionAccessPhoneSensors(context, new PermissionUtil.PermissionListener() {
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
                        PermissionUtil.getPermissionReadSMS(context, new PermissionUtil.PermissionListener() {
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

        };

        return getPermissions;
    }


    private static void toast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
