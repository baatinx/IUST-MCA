.model small
.stack 100h
.data
       num db 3
       f db 1
.code
        mov ax,@data
        mov ds,ax

lbl1:   mov al,num
        mul f
        mov f,al

        dec num
        cmp num,1
        ja lbl1

        mov al,f
        add al,48

        mov dl,al
        mov ah,02h
        int 21h

        mov ah,4ch
        int 21h

end

