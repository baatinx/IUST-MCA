.model small
.stack 900h
.data
        a db 3
        b db 3
.code
        mov ax,@data
        mov ds,ax

        mov al,a
        mul b

        add al,48

        mov dl,al
        mov ah,02h
        int 21h

        mov ah,4ch
        int 21h
end

