.model small
.stack 900h
.data
        num db 7
        d db 2
        prm db "number is prime$"
        nprm db "number is not prime$"

.code
        mov ax,@data
        mov ds,ax

lbl1:   mov al,num
        mov ah,0
        div d

        cmp ah,0
        je chk

        inc d
        jmp lbl1

chk:    mov dl,num
        cmp dl,d
        je setprm

        mov dx,offset nprm
        jmp dsply

setprm:mov dx,offset prm

dsply:  mov ah,09h
        int 21h

        mov ah,4ch
        int 21h

end

