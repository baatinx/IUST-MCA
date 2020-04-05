.model small
.stack 100h
.data
        a db 4
        b db 2
.code
        mov ax,@data
        mov ds,ax

        mov al,a
        sub al,b

        add al,48

        mov dl,al
        mov ah,02h
        int 21h

        mov ah,4ch
        int 21h
end
