; Listing generated by Microsoft (R) Optimizing Compiler Version 19.27.29111.0 

	TITLE	C:\ULIMA\2020_2\LP\ejemplos\ULParadigmaImperativo\MiPrimerPrograma\hola.cpp
	.686P
	.XMM
	include listing.inc
	.model	flat

INCLUDELIB MSVCRTD
INCLUDELIB OLDNAMES

msvcjmc	SEGMENT
__9049B776_hola@cpp DB 01H
msvcjmc	ENDS
PUBLIC	_main
PUBLIC	__JustMyCode_Default
EXTRN	@__CheckForDebuggerJustMyCode@4:PROC
EXTRN	__RTC_CheckEsp:PROC
EXTRN	__RTC_InitBase:PROC
EXTRN	__RTC_Shutdown:PROC
;	COMDAT rtc$TMZ
rtc$TMZ	SEGMENT
__RTC_Shutdown.rtc$TMZ DD FLAT:__RTC_Shutdown
rtc$TMZ	ENDS
;	COMDAT rtc$IMZ
rtc$IMZ	SEGMENT
__RTC_InitBase.rtc$IMZ DD FLAT:__RTC_InitBase
rtc$IMZ	ENDS
; Function compile flags: /Odt
;	COMDAT __JustMyCode_Default
_TEXT	SEGMENT
__JustMyCode_Default PROC				; COMDAT
	push	ebp
	mov	ebp, esp
	pop	ebp
	ret	0
__JustMyCode_Default ENDP
_TEXT	ENDS
; Function compile flags: /Odtp /RTCsu /ZI
;	COMDAT _main
_TEXT	SEGMENT
_suma$ = -8						; size = 4
_main	PROC						; COMDAT
; File C:\ULIMA\2020_2\LP\ejemplos\ULParadigmaImperativo\MiPrimerPrograma\hola.cpp
; Line 2
	push	ebp
	mov	ebp, esp
	sub	esp, 204				; 000000ccH
	push	ebx
	push	esi
	push	edi
	lea	edi, DWORD PTR [ebp-204]
	mov	ecx, 51					; 00000033H
	mov	eax, -858993460				; ccccccccH
	rep stosd
	mov	ecx, OFFSET __9049B776_hola@cpp
	call	@__CheckForDebuggerJustMyCode@4
; Line 3
	mov	DWORD PTR _suma$[ebp], 2
; Line 4
	xor	eax, eax
; Line 5
	pop	edi
	pop	esi
	pop	ebx
	add	esp, 204				; 000000ccH
	cmp	ebp, esp
	call	__RTC_CheckEsp
	mov	esp, ebp
	pop	ebp
	ret	0
_main	ENDP
_TEXT	ENDS
END
