#Java Classes for Admin App

More information : http://docs.ideabiz.lk/en/Go_Live/Admin_API

##Subscription Result

```
{
  "subscription": {
    "number": "94777123456",
    "status": "SUBSCRIBED",
    "registration": {
      "datetime": "2014-05-20 10:33:11",
      "method": "SMS"
    },
    "unregistration": {
      "datetime": "2014-05-20 10:33:11",
      "method": "SMS"
    }
  }
}

```

| field  |Description   | mendetory  |
|---|---|---|
| number  | Subscriber mobile number. Eg: 94777123456  | mendetory  |
|  status |  current  status<br> UNSUBSCRIBED : User already unsubscribed<br>SUBSCRIBED : User have active subscription<br>BLOCKED : User blocked from application<br>INACTIVE : User subscribed to app. but not active. may be insufficient balance | mendetory  |
| registration  | User registration info | mendetory  |
| registration -> datetime  | User registration timestamp | mendetory  |
| registration -> method  | User registration method<br> values : SMS, WEB, USSD| mendetory  |
| unregistration  | User registration info<br>if no unregistration information, this should null  | optional  |
| unregistration -> datetime  | User registration timestamp | mendetory  |
| unregistration -> method  | User registration method<br> values : SMS, WEB, USSD, ADMIN| mendetory  |


## History


```
{
  "subscriberHistory": {
    "number": "94777123456",
    "offset": 10,
    "limit": 0,
    "history": [
      {
        "datetime": "2014-05-20 10:33:11",
        "trigger": "ADMIN",
        "event": "UNSUBSCRIBE",
        "note": "",
        "status": "SUCCESS"
      },
      {
        "datetime": "2014-05-20 10:33:11",
        "trigger": "SYSTEM",
        "event": "CHARGING",
        "note": "no funds",
        "status": "FAILED"
      },
      {
        "datetime": "2014-05-20 10:33:11",
        "trigger": "SYSTEM",
        "event": "SMS",
        "note": "",
        "status": "SUCCESS"
      },
      {
        "datetime": "2014-05-20 10:33:11",
        "trigger": "SUBSCRIBER",
        "event": "SUBSCRIBE",
        "note": "",
        "status": "SUCCESS"
      }
    ]
  }
}
```
| field  |Description   | mendetory  |
|---|---|---|
| number  | Subscriber mobile number. Eg: 94777123456  | mendetory  |
| offset  | Offset of current response | mendetory  |
| limit  | limit of current response  | mendetory  |
| history  | last 10 events regarding specific user<br> this array contain object of history | mendetory  |
| history -> datetime  | event timestamp | mendetory  |
| history -> trigger  | actor of event trigger.<br> Eg : SYSTEM,SUBSCRIBER,ADMIN| mendetory  |
| history -> event  | event type<br>Eg: SUBSCRIBE, UNSUBSCRIBE, SMS, USSD, CHARGING | mendetory  |
| history -> note  | any note as string | mendetory  |
| history -> status  | specific event status<br>Eg : SUCCESS, FAILED | mendetory  |

## Not found subscription

```
{
  "subscription": {
    "number": "94777123456",
    "status": "NOTFOUND"
  }
}
```

| field  |Description   | mendetory  |
|---|---|---|
| number  | Subscriber mobile number. Eg: 94777123456  | mendetory  |
|  status |  current  status<br>NOTFOUND : User subscription not found | mendetory  |

## Subscription deleted

```
{
  "subscription": {
    "number": "94777123456",
    "status": "UNSUBSCRIBED",
  }
}
```


| field  |Description   | mendetory  |
|---|---|---|
| number  | Subscriber mobile number. Eg: 94777123456  | mendetory  |
|  status |  Unsubscribe status<br> UNSUBSCRIBED : Successfully removed user from application<br>NOTFOUND : User subscription not found<br>NOTCHANGED : user not subscribed to application or unsubcription failed | mendetory  |


## Error
```
{
  "error": {
    "statusCode": "ERROR",
    "message": "Unable to proccess request",
  }
}
```
