.model small
.stack 900h
.data
        arr db 0,1,2,3,4,5,6,7,8,9
        i db 0
.code
        mov ax,@data
        mov ds,ax

        lea bx,arr

lbl1:   mov al,[bx]
        add al,48

        mov dl,al
        mov ah,02h
        int 21h

        mov dl,10
        mov ah,02h
        int 21h

        inc bx
        inc i

        cmp i,9
        jbe lbl1


        mov ah,4ch
        int 21h

end

