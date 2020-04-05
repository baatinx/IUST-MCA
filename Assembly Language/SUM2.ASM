.model small
.stack 100H
.data
        x db 2
        y db 5
        z db ?
.code
        mov ax,@data
        mov ds,ax

        mov al,x
        add al,y
        add al,48

        mov dl,al
        mov ah,02h
        int 21h


        mov ah,4ch
        int 21h
end        

