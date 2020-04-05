.model small
.stack 100H
.data
        c db 'A'
.code
        mov ax,@data
        mov ds,ax

        mov dl,c
        mov ah,02h
        int 21h

        mov ah,4ch
        int 21h
end        

