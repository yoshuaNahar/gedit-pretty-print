## gedit-pretty-print

#### How to install: 
* Download the provided jar.
* In gedit enable External Tools. `Preference > Plugins > External Tools`
* Add a new tool inside Manage External Tools. The shortcut I use for pretty print is Ctrl + Shift + T.
* Set input to Current selection (default to document) and output replace current selection
* Set this in the text field ```#!/bin/sh java -jar ~/location/of/jar/gedit-pretty-print-0.0.1.jar```

##### Input
```
2018-10-15 20:31:43 INFO  CustomMessageTransformer:32 - GenericMessage [payload={licenceKey=[100], processType=[deploy]}, headers={http_requestMethod=GET, errorChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d, accept-language=nl-NL,nl;q=0.9,en-US;q=0.8,en-NL;q=0.7,en;q=0.6, cookie=Idea-5a3c33a4=eab537f7-01c1-4d49-8050-8c3d63b044d4, accept=[text/html, application/xhtml+xml, application/xml;q=0.9, image/webp, image/apng, */*;q=0.8], replyChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d, host=localhost:8080, http_requestUrl=http://localhost:8080/web?licenceKey=100&processType=deploy, connection=keep-alive, id=9f5dc2fb-ba4f-7dfa-1c0a-06e8b0482b1b, accept-encoding=gzip, deflate, br, user-agent=Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36, timestamp=1539628303815}]
2018-10-15 20:31:44 INFO  LoggingHandler:202 - webSocketInputLoggingChannel: org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d Headers - {simpMessageType=MESSAGE, content-length=90, id=ad05243c-c922-7b80-fd67-b6ffdb543b47, simpSessionAttributes={}, simpSessionId=0, timestamp=1539628304867}
```
##### Output
```
2018-10-15 20:31:43 INFO  CustomMessageTransformer:32 - GenericMessage [
	payload={
		licenceKey=[
			100
		]
		,
		processType=[
			deploy
		]
		
	}
	,
	headers={
		http_requestMethod=GET,
		errorChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d,
		accept-language=nl-NL,
		nl;q=0.9,
		en-US;q=0.8,
		en-NL;q=0.7,
		en;q=0.6,
		cookie=Idea-5a3c33a4=eab537f7-01c1-4d49-8050-8c3d63b044d4,
		accept=[
			text/html,
			application/xhtml+xml,
			application/xml;q=0.9,
			image/webp,
			image/apng,
			*/*;q=0.8
		]
		,
		replyChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d,
		host=localhost:8080,
		http_requestUrl=http://localhost:8080/web?licenceKey=100&processType=deploy,
		connection=keep-alive,
		id=9f5dc2fb-ba4f-7dfa-1c0a-06e8b0482b1b,
		accept-encoding=gzip,
		deflate,
		br,
		user-agent=Mozilla/5.0 (
			X11; Linux x86_64
		)
		AppleWebKit/537.36 (
			KHTML,
			like Gecko
		)
		Chrome/69.0.3497.100 Safari/537.36,
		timestamp=1539628303815
	}
	
]
2018-10-15 20:31:44 INFO  LoggingHandler:202 - webSocketInputLoggingChannel: org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@44e8bf3d Headers - {
	simpMessageType=MESSAGE,
	content-length=90,
	id=ad05243c-c922-7b80-fd67-b6ffdb543b47,
	simpSessionAttributes={
		
	}
	,
	simpSessionId=0,
	timestamp=1539628304867
}
```

#### Credits
Kees Garstman
