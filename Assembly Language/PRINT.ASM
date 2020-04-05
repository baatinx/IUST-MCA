.model small
.stack 100h
.data
        num db 6
.code
        mov ax,@data
        mov ds,ax


        mov al,num
        add al,48

        mov dl,al
        mov ah,02h
        int 21h

        mov ah,4ch
        int 21h

end

